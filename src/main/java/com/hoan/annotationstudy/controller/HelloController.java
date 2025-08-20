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

    @GetMapping("/test")
    public String test() {
        throw new RuntimeException("테스트 예외 발생!");
    }
}
