package com.kj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class NacosFeginServerApp {
    public static void main(String[] args) {
        SpringApplication.run(NacosFeginServerApp.class,args);
    }

    @GetMapping("message")
    public String getMessage(){
        System.out.println("=========");
        return "message";
    }
}
