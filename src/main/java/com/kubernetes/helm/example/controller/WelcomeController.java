package com.kubernetes.helm.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @GetMapping("/message")
    public String message() {
        return "3K-TECHNOLOGIES";
    }
}
