package com.matheuscordeiro.loginuserapispringboot.entities;

import com.sun.istack.NotNull;
import lombok.Builder;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Builder
public class Costumer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @NotNull
    String name;

    @NotNull
    @Column(nullable = false, unique = true)
    String cpfOrCnpj;

    @NotNull
    String address;

    @NotNull
    Integer phone;
}
