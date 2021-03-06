package com.fangfaze.java.ffweifuwu.ffEurekaClinet;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Value("${server.port}")
    Integer port;

    @Value("${foo}")
    String foo;

    @RequestMapping("/hi")
    public String hi(String name) {
        return foo + ":Hello (" + port + "), " + name;
    }
}
