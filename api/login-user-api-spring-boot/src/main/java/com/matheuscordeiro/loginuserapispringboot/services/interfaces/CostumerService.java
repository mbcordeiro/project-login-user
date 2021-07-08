package com.matheuscordeiro.loginuserapispringboot.services.interfaces;

import com.matheuscordeiro.loginuserapispringboot.entities.Costumer;

import java.util.List;
import java.util.Optional;

public interface CostumerService {
    Optional<Costumer> findByIdCostumer();

    List<Costumer> findAllCostumer();

    Costumer saveCostumer();

    Costumer updateCostumer();

    void deleteCostumerById();
}
