package com.dynatheia.heset.Authentication.controller;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {
    @GetMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }
}
