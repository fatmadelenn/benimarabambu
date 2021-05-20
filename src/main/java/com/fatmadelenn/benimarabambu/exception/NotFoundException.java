package com.fatmadelenn.benimarabambu.exception;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class NotFoundException extends RuntimeException {

    private static final long serialVersionUID = -5859007673190833159L;

    public NotFoundException(String message) {
        super(message);
    }
}
