package com.winky.springcloud.controller;

import com.winky.springcloud.entities.CommonResult;
import com.winky.springcloud.entities.Payment;
import com.winky.springcloud.service.PaymentFeignService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @auther Li Wenjie
 * @create 2022-01-11 21:38
 */
@Slf4j
@RestController
public class OrderFeignController {
    @Autowired
    PaymentFeignService paymentFeignService;

    @GetMapping(value = "/consumer/payment/getPaymentID/{id}")
    public CommonResult<Payment> getPaymentID(@PathVariable("id") Long id){
        return paymentFeignService.getPaymentID(id);
    }

    @GetMapping(value = "/payment/feign/timeout")
    public String paymentFeignTimeout(){
        return paymentFeignService.paymentFeignTimeout();
    }
}
