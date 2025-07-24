package com.eazybytes.accounts.exception;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException{

    public ResourceNotFoundException(String resorceName, String fieldName,String fieldValue){
        super(String.format("%s not found with the given input data %s %s",resorceName,fieldName,fieldValue));
    }
}
