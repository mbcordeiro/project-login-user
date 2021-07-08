package com.matheuscordeiro.loginuserapispringboot.services;

import com.matheuscordeiro.loginuserapispringboot.entities.User;
import com.matheuscordeiro.loginuserapispringboot.exceptions.BusinessException;
import com.matheuscordeiro.loginuserapispringboot.repositories.UserRepository;
import com.matheuscordeiro.loginuserapispringboot.services.interfaces.UserService;

import java.util.Optional;

public class UserServiceImpl implements UserService {
    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public Optional<User> findUserByIdOrThrow(Long id) {
        try {
            return findUserById(id);
        } catch (BusinessException e) {
            throw  new BusinessException("Ocorreu um inesperado ao tentar obter um usuário pro id");
        }
    }

    @Override
    public User findUserByEmailOrThrow(String email) {
        try {
            return findUserByEmail(email);
        } catch (BusinessException e) {
            throw  new BusinessException("Ocorreu um inesperado ao tentar obter um usuário por email");
        }
    }

    private Optional<User> findUserById(Long id) {
        return userRepository.findById(id);
    }

    private User findUserByEmail(String email) {
        return userRepository.findByEmail(email);
    }
}
