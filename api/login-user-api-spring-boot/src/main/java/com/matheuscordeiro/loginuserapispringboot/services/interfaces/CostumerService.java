package com.matheuscordeiro.loginuserapispringboot.services.interfaces;

import com.matheuscordeiro.loginuserapispringboot.entities.Costumer;

import java.util.Optional;

public interface CostumerService {
    Long findByIdCostumer();

    Optional findAllCostumer();

    Costumer saveCostumer();

    Costumer updateCostumer();

    void deleteCostumerById();
}
