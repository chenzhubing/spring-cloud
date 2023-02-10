package kj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class NacosFeginClientApp {
    public static void main(String[] args) {
        SpringApplication.run(NacosFeginClientApp.class,args);
    }

}
