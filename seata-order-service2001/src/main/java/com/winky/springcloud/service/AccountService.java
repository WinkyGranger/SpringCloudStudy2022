package com.winky.springcloud.service;

import com.winky.springcloud.domain.CommomResult;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

@EnableFeignClients(value = "seata-account-service")
public interface AccountService {
    @PostMapping("/account/decrease")
    CommomResult decrease(@RequestParam("userId") Long userId,@RequestParam("money") BigDecimal money);//money是需要扣款的金额
}
