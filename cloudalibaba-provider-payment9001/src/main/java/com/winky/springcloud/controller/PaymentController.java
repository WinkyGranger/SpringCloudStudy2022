package com.winky.springcloud.controller;

import com.winky.springcloud.entities.CommonResult;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class PaymentController {
    @Value("${server.port}")
    String serverPort;

    public HashMap<Integer,String> newHs(){
        HashMap<Integer,String> hsmap =  new HashMap();
        hsmap.put(1,"winky");
        hsmap.put(2,"jacob");
        return hsmap;
    }

    @GetMapping(value = "/payment/nacos/{id}")
    public String getPatment(@PathVariable("id") Integer id){
        return "nacos" + "\t" + "serverPort:" + serverPort;
    }

    @GetMapping(value = "/paymentSQL/{id}")
    public CommonResult getSqlPayment(@PathVariable("id") Integer id){
        String name = newHs().get(id);
        if(name!= null){
            return new CommonResult(200,"查询成功",name + "/t" +serverPort);
        }else{
            return new CommonResult(404,"没找到" + serverPort);
        }
    }


}
