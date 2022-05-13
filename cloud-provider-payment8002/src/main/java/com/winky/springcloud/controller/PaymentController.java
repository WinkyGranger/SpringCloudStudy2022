package com.winky.springcloud.controller;

import com.winky.springcloud.entities.CommonResult;
import com.winky.springcloud.entities.Payment;
import com.winky.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @auther Li Wenjie
 * @create 2022-01-03 14:33
 */
@Slf4j
@RestController
public class PaymentController {

    @Autowired
    PaymentService paymentService;
    @Value("${server.port}")
    String serverPort;
    @Autowired
    DiscoveryClient discoveryClient;

    @PostMapping(value = "/payment/create")
    //后端接受前端传过来的数据时要用@RequestBody才能接收到
    public CommonResult create(@RequestBody Payment payment){
        int createResult = paymentService.create(payment);
        log.info("插入结果：" + createResult);
        if(createResult > 0){
            return new CommonResult(200,"插入数据库成功",createResult);
        }else{
            return new CommonResult(404,"插入失败",null);
        }
    }

    @GetMapping(value = "/payment/getPaymentID/{id}")
    public CommonResult getPaymentID(@PathVariable("id") Long id){
        Payment paymentID = paymentService.getPaymentID(id);
        log.info("查询结果" + paymentID);
        if(paymentID != null){
            return new CommonResult(200,"查询数据库成功,端口号为：" + serverPort,paymentID);
        }else{
            return new CommonResult(404,"没有对应记录:" + id,null);
        }
    }

    @GetMapping(value = "/payment/discovery")
    public Object discovery()
    {
        List<String> services = discoveryClient.getServices();
        for (String element : services) {
            log.info("*****element: "+element);
        }

        List<ServiceInstance> instances = discoveryClient.getInstances("CLOUD-PAYMENT-SERVICE");
        for (ServiceInstance instance : instances) {
            log.info(instance.getServiceId()+"\t"+instance.getHost()+"\t"+instance.getPort()+"\t"+instance.getUri());
        }

        return this.discoveryClient;
    }

    @GetMapping(value = "/payment/lb")
    public String getPaymentLB(){
        return serverPort;
    }

    @GetMapping(value = "/payment/feign/timeout")
    public String paymentFeignTimeout(){
        try {
            TimeUnit.SECONDS.sleep(3);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        return serverPort;
    }

}
