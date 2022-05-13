package com.winky.springcloud.service.Impl;

import com.winky.springcloud.dao.OrderDao;
import com.winky.springcloud.domain.Order;
import com.winky.springcloud.service.AccountService;
import com.winky.springcloud.service.OrderService;
import com.winky.springcloud.service.StorageService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
@Slf4j
public class OrderServiceImpl implements OrderService {
    @Resource
    OrderDao orderDao;
    @Resource
    AccountService accountService;
    @Resource
    StorageService storageService;
    @Override
    public void create(Order order) {
        log.info("创建订单开始");
        orderDao.create(order);
        log.info("订单微服务调用库存,对库存进行扣减");
        storageService.decrease(order.getProductId(),order.getCount());
        log.info("扣减结束");
        accountService.decrease(order.getUserId(),order.getMoney());
        log.info("开始修改订单状态");
        orderDao.update(order.getId(),1);
        log.info("----->修改订单状态结束");
        log.info("----->下订单结束了，O(∩_∩)O哈哈~");
    }


}
