package com.winky.springcloud.controller;

import com.winky.springcloud.entities.CommonResult;
import com.winky.springcloud.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @auther Li Wenjie
 * @create 2022-01-03 21:01
 */

@RestController
@Slf4j
public class OrderController {

//    private static final String PRIMARY_URL = "http://localhost:8001";
    private static final String PRIMARY_URL = "http://CLOUD-PAYMENT-SERVICE";

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/consumer/payment/create")
    public CommonResult<Payment> create(Payment payment){
        return restTemplate.postForObject(PRIMARY_URL+"/payment/create",payment,CommonResult.class);
    }

    @GetMapping(value = "/consumer/payment/getPaymentID/{id}")
    public CommonResult getPaymentID(@PathVariable("id") Long id){
        return restTemplate.getForObject(PRIMARY_URL+"/payment/getPaymentID/"+id,CommonResult.class);
    }

    @GetMapping(value = "/consumer/payment/getForEntity/{id}")
    public CommonResult getPaymentID2(@PathVariable("id") Long id) {
        ResponseEntity<CommonResult> forEntity = restTemplate.getForEntity(PRIMARY_URL + "/payment/getPaymentID/" + id, CommonResult.class);
        if(forEntity.getStatusCode().is2xxSuccessful()){
            return forEntity.getBody();
        }else{
            return new CommonResult(404,"操作失败:");
        }
    }
}
