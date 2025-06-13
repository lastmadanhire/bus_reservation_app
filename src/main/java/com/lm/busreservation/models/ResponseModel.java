package com.lm.busreservation.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
public class ResponseModel<T> {
    private int statusCode;
    private String message;
    private T response;
}
