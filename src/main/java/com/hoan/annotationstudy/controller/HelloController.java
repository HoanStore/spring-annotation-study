package com.hoan.annotationstudy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    private final String myMessage;

    public HelloController(String myMessage) {
        this.myMessage = myMessage;
    }

    @GetMapping("/bean")
    public String beanExample() {
        return myMessage;
    }
}
