package com.winky.springcloud.service;

import com.winky.springcloud.domain.CommomResult;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@EnableFeignClients(value = "seata-storage-service")
public interface StorageService {
    @PostMapping(value = "/storage/decrease")
    CommomResult decrease(@RequestParam("productId") Long productId, @RequestParam("total") Integer count);//count是顾客购买数量
}
