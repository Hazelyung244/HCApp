package com.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class hcsController {

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

}
