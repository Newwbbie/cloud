package com.newwbbie.springcloud.service.impl;

import com.newwbbie.springcloud.dao.PaymentDao;
import com.newwbbie.springcloud.entities.Payment;
import com.newwbbie.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @auther wb
 * @create 2021/1/28
 **/
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    public int add(Payment payment){
        return paymentDao.add(payment);
    }

    public Payment getPaymentById(Long id){
        return paymentDao.getPaymentById(id);
    }
}
