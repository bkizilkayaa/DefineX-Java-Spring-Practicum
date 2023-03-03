package com.burak.orderapplication.exception;

import lombok.experimental.StandardException;


public class CustomerCannotFindById extends RuntimeException  {
    public CustomerCannotFindById(String message) {
        super(message);
    }
}
