package com.matheuscordeiro.loginuserapispringboot.services;

import com.matheuscordeiro.loginuserapispringboot.entities.Costumer;
import com.matheuscordeiro.loginuserapispringboot.services.interfaces.CostumerService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CostumerServiceImpl implements CostumerService {
    @Override
    public Optional<Costumer> findByIdCostumer() {
        return null;
    }

    @Override
    public List<Costumer> findAllCostumer() {
        return null;
    }

    @Override
    public Costumer saveCostumer() {
        return null;
    }

    @Override
    public Costumer updateCostumer() {
        return null;
    }

    @Override
    public void deleteCostumerById() {

    }
}
