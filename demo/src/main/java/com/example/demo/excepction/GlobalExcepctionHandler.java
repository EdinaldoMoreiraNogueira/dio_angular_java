package com.example.demo.excepction;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import  org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class GlobalExcepctionHandler {


    @ExceptionHandler (ResourceNotFoundExcecption.class)
    public ResponseEntity<?> resourceNotFoundExcecption(ResourceNotFoundExcecption ex, WebRequest request){
     ErrorDetails errorDetails=new ErrorDetails(new Date(), ex.getMessage(), request.getDescription(false));
     return new ResponseEntity<>(errorDetails, HttpStatus.NOT_FOUND);
     }
     @ExceptionHandler(Exception.class)
     public ResponseEntity<?>globalExcepctionHandler(Exception ex, WebRequest request){
        ErrorDetails errorDetails=new ErrorDetails(new Date(), ex.getMessage(), request.getDescription(false));
         return new ResponseEntity<>(errorDetails, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
