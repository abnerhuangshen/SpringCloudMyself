package com.george.springcloud.service;

import com.george.springcloud.entities.Payment;

/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: abner-shen
 * @Date: 2020/12/22/16:36
 * @Description:
 */
public interface PaymentService {
    int create (Payment payment);
    Payment getPaymentById(Long id);
}
