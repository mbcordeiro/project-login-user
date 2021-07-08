package com.matheuscordeiro.loginuserapispringboot.repositories;

import com.matheuscordeiro.loginuserapispringboot.entities.Costumer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CostumerRepository extends JpaRepository<Long, Costumer> {
}
