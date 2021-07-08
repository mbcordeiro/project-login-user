package com.matheuscordeiro.loginuserapispringboot.services.interfaces;

import com.matheuscordeiro.loginuserapispringboot.entities.User;

import java.util.Optional;

public interface UserService {
    Optional<User> findUserByIdOrThrow(Long id);

    User findUserByEmailOrThrow(String email);
}
