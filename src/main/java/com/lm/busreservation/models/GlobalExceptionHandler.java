package com.lm.busreservation.models;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import java.nio.file.AccessDeniedException;

@ControllerAdvice
public class GlobalExceptionHandler {
    final ErrorDetails errorDetails=new ErrorDetails();
//    methods associated with exception
    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorDetails>handleGlobalException(
            Exception exception,
            WebRequest request
    ){
        errorDetails.setErrorMessage(exception.getLocalizedMessage());
        errorDetails.setDevErrorMessage(request.getDescription(false));
        errorDetails.setTimeStamp(System.currentTimeMillis());
        return new ResponseEntity<>(errorDetails, HttpStatus.BAD_REQUEST);
    }
    @ExceptionHandler(AccessDeniedException.class)
    public ResponseEntity<ErrorDetails>handleAccessDeniedException(
            AccessDeniedException exception,
            WebRequest request
    ){
        errorDetails.setErrorMessage(exception.getLocalizedMessage());
        errorDetails.setDevErrorMessage(request.getDescription(false));
        errorDetails.setTimeStamp(System.currentTimeMillis());
        return new ResponseEntity<>(errorDetails, HttpStatus.BAD_REQUEST);
    }
    @ExceptionHandler(ReservationApiException.class)
    public ResponseEntity<ErrorDetails>handleReservationApiException(
            ReservationApiException exception,
            WebRequest request
    ){
        errorDetails.setErrorCode(exception.getStatus().value());
        errorDetails.setErrorMessage(exception.getLocalizedMessage());
        errorDetails.setDevErrorMessage(request.getDescription(false));
        errorDetails.setTimeStamp(System.currentTimeMillis());
        return new ResponseEntity<>(errorDetails, HttpStatus.BAD_REQUEST);
    }
}
