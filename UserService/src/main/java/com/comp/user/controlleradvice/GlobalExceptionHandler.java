package com.comp.user.controlleradvice;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import com.comp.user.dto.Response;
import com.comp.user.exception.UserIdAlreadyExistException;
import com.comp.user.exception.UserNotFoundException;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(UserNotFoundException.class)
    public ResponseEntity<Response> handleUserNotFoundException(UserNotFoundException userNotFoundException,
    WebRequest webRequest){
        return ResponseEntity.status(HttpStatus.NOT_FOUND)
        .body(new Response(HttpStatus.NOT_FOUND.toString(),
        userNotFoundException.getMessage(),
        new Date()));
    }
    
    @ExceptionHandler(UserIdAlreadyExistException.class)
    public ResponseEntity<Response> handleEmailIdAlreadyExistsException(UserIdAlreadyExistException emailIdAlreadyExistException,
    WebRequest webRequest){
        return ResponseEntity.status(HttpStatus.BAD_REQUEST)
        .body(new Response(HttpStatus.BAD_REQUEST.toString(),
        emailIdAlreadyExistException.getMessage(),
        new Date()));
    }
    

}
