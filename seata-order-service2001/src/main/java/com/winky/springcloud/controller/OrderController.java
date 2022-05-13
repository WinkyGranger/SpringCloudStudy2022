package com.winky.springcloud.controller;


import com.winky.springcloud.domain.CommomResult;
import com.winky.springcloud.domain.Order;
import com.winky.springcloud.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
    @Autowired
    OrderService orderService;

    @GetMapping("/order/create")
    public CommomResult create(Order order){
        orderService.create(order);
        return new CommomResult(200,"订单创建成功");
    }

}
