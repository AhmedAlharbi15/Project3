package com.example.projectt3.Api;

public class ApiException extends RuntimeException{
    private String message;
    public ApiException(String message)
    {
        super(message);

    }
}
