package com.winky.springcloud.dao;

import com.winky.springcloud.domain.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface OrderDao {
    //创建订单
    void create(Order order);
    //修改订单
    int update(@Param("userId") Long id,@Param("status") Integer status);

}
