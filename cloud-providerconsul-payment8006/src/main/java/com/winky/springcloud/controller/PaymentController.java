package com.winky.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

/**
 * @auther Li Wenjie
 * @create 2022-01-03 14:33
 */
@Slf4j
@RestController
public class PaymentController {

    @Value("${server.port}")
    String serverPort;

    @RequestMapping(value = "/payment/consul")
    public String paymentconsul(){
        return "springcloud with consul" + serverPort + "\t" + UUID.randomUUID().toString();
    }
}
