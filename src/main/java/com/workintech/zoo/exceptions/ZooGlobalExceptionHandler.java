package com.workintech.zoo.exceptions;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ZooGlobalExceptionHandler {

    private static final Logger logger = LoggerFactory.getLogger(ZooGlobalExceptionHandler.class);

    // Handle ZooException
    @ExceptionHandler(ZooException.class)
    public ResponseEntity<ZooErrorResponse> handleZooException(ZooException ex) {

        logger.error("ZooException occurred: {}", ex.getMessage());


        ZooErrorResponse errorResponse = new ZooErrorResponse(
                ex.getMessage(),
                ex.getHttpStatus().value(),
                System.currentTimeMillis()
        );

        return new ResponseEntity<>(errorResponse, ex.getHttpStatus());
    }

    // Handle all other exceptions
    @ExceptionHandler(Exception.class)
    public ResponseEntity<ZooErrorResponse> handleGenericException(Exception ex) {

        logger.error("An unexpected error occurred: {}", ex.getMessage());


        ZooErrorResponse errorResponse = new ZooErrorResponse(
                "An unexpected error occurred.",
                HttpStatus.INTERNAL_SERVER_ERROR.value(),
                System.currentTimeMillis()
        );

        return new ResponseEntity<>(errorResponse, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
