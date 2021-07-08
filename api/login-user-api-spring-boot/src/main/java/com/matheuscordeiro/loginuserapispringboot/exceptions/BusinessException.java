package com.matheuscordeiro.loginuserapispringboot.exceptions;

public class BusinessException extends RuntimeException{
    public BusinessException(String msg) {
        super(msg);
    }
}