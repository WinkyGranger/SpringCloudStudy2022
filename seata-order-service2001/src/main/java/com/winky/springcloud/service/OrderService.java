package com.winky.springcloud.service;

import com.winky.springcloud.domain.Order;
import org.apache.ibatis.annotations.Param;

public interface OrderService {
    //创建订单
    void create(Order order);

}
