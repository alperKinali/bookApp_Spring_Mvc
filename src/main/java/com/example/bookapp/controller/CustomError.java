package com.example.bookapp.controller;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Builder
public class CustomError {
    private LocalDateTime timestamp;
    private int status;
    private String error;
    private String message;
    private String path;
}
