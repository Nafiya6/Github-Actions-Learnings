package com.gitactions.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    
    @GetMapping(path = "/") 
    public String getInfo() {
        return "Welcome to Spring Agular demo";
    }
    
}