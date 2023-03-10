package com.kj;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class NacosConfig {

    public static void main(String[] args) {
        SpringApplication.run(NacosConfig.class,args);
    }

    @RequestMapping("/user-config")
    @RestController
    @RefreshScope
    public class UserController{

        @Value("${user.name}")
        private String userName;

        @RequestMapping("/name")
        public String config(){
            return userName;
        }

    }

}
