package com.comp.user.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.BAD_REQUEST)
public class UserIdAlreadyExistException extends RuntimeException{
    private String message;

    public UserIdAlreadyExistException(String message){
        super(message);
        this.message = message;
    }
}
