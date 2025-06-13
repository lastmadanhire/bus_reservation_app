package com.lm.busreservation.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor
public class ReservationApiException extends RuntimeException{
    private HttpStatus status;
    private String message;

}
