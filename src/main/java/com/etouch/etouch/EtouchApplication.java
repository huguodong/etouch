package com.etouch.etouch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class EtouchApplication {

    public static void main(String[] args) {
        SpringApplication.run(EtouchApplication.class, args);
    }

    @RequestMapping("/")
    String home() {
        return "Hello World!1";
    }
}



