package com.winky.springcloud.service.impl;

import com.winky.springcloud.entities.CommonResult;
import com.winky.springcloud.entities.Payment;
import com.winky.springcloud.service.PaymentService;
import org.springframework.stereotype.Component;

@Component
public class PaymentFallbackService implements PaymentService {
    @Override
    public CommonResult paymentSQL(Long id) {
        return new CommonResult<>(44444,"服务降级返回,---PaymentFallbackService",new Payment(id,"errorSerial"));
    }
}
