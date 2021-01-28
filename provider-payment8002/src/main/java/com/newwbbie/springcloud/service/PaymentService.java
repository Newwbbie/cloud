package com.newwbbie.springcloud.service;

import com.newwbbie.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @auther wb
 * @create 2021/1/28
 **/
public interface PaymentService {

    int add(Payment payment);

    Payment getPaymentById(@Param("id") Long id);
}
