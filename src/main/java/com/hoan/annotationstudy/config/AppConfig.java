package com.hoan.annotationstudy.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {


    @Bean
    public String myMessage() {
        return "Bean으로 등록한 메시지";
    }

}
