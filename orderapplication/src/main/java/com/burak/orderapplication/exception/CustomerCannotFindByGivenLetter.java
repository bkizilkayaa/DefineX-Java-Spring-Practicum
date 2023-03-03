package com.burak.orderapplication.exception;

public class CustomerCannotFindByGivenLetter extends RuntimeException{
    public CustomerCannotFindByGivenLetter(String message) {
        super(message);
    }
}
