package com.angularspring.getfire.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class SimpleController {

    @RequestMapping("/hello")
    public String greet(){
        return "Hello from backend";
    }
}
