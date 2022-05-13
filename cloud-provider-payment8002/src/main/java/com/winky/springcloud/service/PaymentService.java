package com.winky.springcloud.service;

import com.winky.springcloud.entities.Payment;

/**
 * @auther Li Wenjie
 * @create 2022-01-03 14:29
 */
public interface PaymentService {
    int create(Payment payment);
    Payment getPaymentID(Long id);
}
