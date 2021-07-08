package com.matheuscordeiro.loginuserapispringboot.services;

import com.matheuscordeiro.loginuserapispringboot.entities.Costumer;
import com.matheuscordeiro.loginuserapispringboot.exceptions.BusinessException;
import com.matheuscordeiro.loginuserapispringboot.exceptions.ObjectNotFoundException;
import com.matheuscordeiro.loginuserapispringboot.services.interfaces.CostumerService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CostumerServiceImpl implements CostumerService {
    private static final String COSTUMER = "Costumer";

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
        } catch (BusinessException e) {
            throw new BusinessException("Ocorreu um erro inesperado ao atualizar o cliente na base de dados");
        }
    }

    @Override
    public void deleteCostumerByIdOrThrow(Long id) {
        try {
            deleteCostumerById(id);
        } catch (BusinessException e) {
            throw new BusinessException("Ocorreu um erro inesperado ao deletar o cliente na base de dados");
        }
    }

    private Optional<Costumer> findByIdCostumer(Long id) {
        return null;
    }

    private List<Costumer> findAllCostumer() {
        return null;
    }

    private Costumer saveCostumer(Costumer costumer) {
        return null;
    }

    private Costumer updateCostumer(Costumer costumer) {
        return null;
    }

    private void deleteCostumerById(Long id) {

    }

    private Costumer verifyIfExists(Long id) {
        return null;
    }
}
