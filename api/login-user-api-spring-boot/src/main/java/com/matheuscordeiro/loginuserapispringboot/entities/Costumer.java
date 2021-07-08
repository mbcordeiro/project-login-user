package com.matheuscordeiro.loginuserapispringboot.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Costumer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @NotNull
    @Column(nullable = false)
    String name;

    @NotNull
    @Column(nullable = false, unique = true)
    String cpfOrCnpj;

    @NotNull
    @Column(nullable = false)
    String address;

    String addressSecondary;

    @NotNull
    @Column(nullable = false)
    Integer phone;

    Integer phoneSecondary;
}
