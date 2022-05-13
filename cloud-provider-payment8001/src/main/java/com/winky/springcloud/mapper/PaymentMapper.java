package com.winky.springcloud.mapper;

import com.winky.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;

/**
 * @auther Li Wenjie
 * @create 2022-01-03 13:28
 */
@Mapper
public interface PaymentMapper {
    int create(Payment payment);
    Payment getPaymentID(Long id);
}
