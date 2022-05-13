package com.winky.springcloud.service.impl;

import com.winky.springcloud.entities.Payment;
import com.winky.springcloud.mapper.PaymentMapper;
import com.winky.springcloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @auther Li Wenjie
 * @create 2022-01-03 14:30
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    PaymentMapper paymentMapper;

    @Override
    public int create(Payment payment) {
        return paymentMapper.create(payment);
    }

    @Override
    public Payment getPaymentID(Long id) {
        return paymentMapper.getPaymentID(id);
    }
}
