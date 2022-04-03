package com.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletResponse;

@ControllerAdvice
public class ControllerHandlers {

    @ExceptionHandler({JsonProcessingException.class, RuntimeException.class})
    public ResponseEntity<Object> handleAllException(HttpServletResponse e, RuntimeException ex) {
        System.out.println(e.getStatus());
        return new ResponseEntity<Object>(ex.getMessage(), HttpStatus.OK);
    }
}