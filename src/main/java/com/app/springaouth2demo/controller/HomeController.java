package com.app.springaouth2demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/api")
public class HomeController {

    @GetMapping("/")
    public String home(){
        return "Hello";
    }

}
