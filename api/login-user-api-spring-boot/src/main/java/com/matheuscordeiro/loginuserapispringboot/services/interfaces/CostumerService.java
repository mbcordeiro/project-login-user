package com.matheuscordeiro.loginuserapispringboot.services.interfaces;

import com.matheuscordeiro.loginuserapispringboot.entities.Costumer;
import com.matheuscordeiro.loginuserapispringboot.exceptions.BusinessException;
import com.matheuscordeiro.loginuserapispringboot.exceptions.ObjectNotFoundException;

import java.util.List;
import java.util.Optional;

public interface CostumerService {
    Optional<Costumer> findByIdCostumerOrThrow(Long id) throws ObjectNotFoundException;

    List<Costumer> findAllCostumerOrThrow() throws ObjectNotFoundException;

    Costumer saveCostumerOrThrow(Costumer costumer);

    Costumer updateCostumerOrThrow(Long id, Costumer costumer);

    void deleteCostumerByIdOrThrow(Long id);
}
