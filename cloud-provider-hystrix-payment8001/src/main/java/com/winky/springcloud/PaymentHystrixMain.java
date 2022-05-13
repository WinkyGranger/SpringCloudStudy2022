package com.winky.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @auther Li Wenjie
 * @create 2022-01-13 11:18
 */

@SpringBootApplication
@EnableEurekaClient
public class PaymentHystrixMain {
    public static void main(String[] args) {
        SpringApplication.run(PaymentHystrixMain.class, args);
    }
}

