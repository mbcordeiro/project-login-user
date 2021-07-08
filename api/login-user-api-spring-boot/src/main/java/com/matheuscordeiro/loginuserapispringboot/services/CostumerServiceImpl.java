package com.matheuscordeiro.loginuserapispringboot.services;

import com.matheuscordeiro.loginuserapispringboot.entities.Costumer;
import com.matheuscordeiro.loginuserapispringboot.exceptions.BusinessException;
import com.matheuscordeiro.loginuserapispringboot.exceptions.ObjectNotFoundException;
import com.matheuscordeiro.loginuserapispringboot.repositories.CostumerRepository;
import com.matheuscordeiro.loginuserapispringboot.services.interfaces.CostumerService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CostumerServiceImpl implements CostumerService {
    private static final String COSTUMER = "Costumer";

    private CostumerRepository costumerRepository;

    public CostumerServiceImpl(CostumerRepository costumerRepository) {
        this.costumerRepository = costumerRepository;
    }

    @Override
    public Optional<Costumer> findByIdCostumerOrThrow(Long id) throws ObjectNotFoundException {
        try {
            return findByIdCostumer(id);
        } catch (Exception e) {
            throw new ObjectNotFoundException(COSTUMER, id);
        }
    }

    @Override
    public List<Costumer> findAllCostumerOrThrow() {
        try {
            return findAllCostumer();
        } catch (BusinessException e) {
            throw new BusinessException("Ocorreu um erro inesperado ao obter os clientes");
        }
    }

    @Override
    public Costumer saveCostumerOrThrow(Costumer costumer) {
        try {
            return saveCostumer(costumer);
        } catch (BusinessException e) {
            throw new BusinessException("Ocorreu um erro inesperado ao inserir o cliente na base de dados");
        }
    }

    @Override
    public Costumer updateCostumerOrThrow(Costumer costumer) {
        try {
          return updateCostumer(costumer);
        } catch (BusinessException | ObjectNotFoundException e) {
            throw new BusinessException("Ocorreu um erro inesperado ao atualizar o cliente na base de dados");
        }
    }

    @Override
    public void deleteCostumerByIdOrThrow(Long id) {
        try {
            deleteCostumerById(id);
        } catch (BusinessException | ObjectNotFoundException e) {
            throw new BusinessException("Ocorreu um erro inesperado ao deletar o cliente na base de dados");
        }
    }

    private Optional<Costumer> findByIdCostumer(Long id) {
        return costumerRepository.findById(id);
    }

    private List<Costumer> findAllCostumer() {
        return costumerRepository.findAll();
    }

    private Costumer saveCostumer(Costumer costumer) {
        return costumerRepository.save(costumer);
    }

    private Costumer updateCostumer(Costumer costumer) throws ObjectNotFoundException {
        verifyIfExists(costumer.getId());
        return costumerRepository.save(costumer);
    }

    private void deleteCostumerById(Long id) throws ObjectNotFoundException {
        verifyIfExists(id);
        costumerRepository.deleteById(id);
    }

    private Costumer verifyIfExists(Long id) throws ObjectNotFoundException {
        return costumerRepository.findById(id).orElseThrow(() -> new ObjectNotFoundException(COSTUMER, id));
    }
}
