package com.lemon;

import org.springframework.validation.BindingResult;

public class ProjectException extends Exception{

    public ProjectException(String message){
        super(message);
    }

}
