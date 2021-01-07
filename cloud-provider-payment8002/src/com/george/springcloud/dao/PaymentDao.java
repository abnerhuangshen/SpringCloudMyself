package com.george.springcloud.dao;

import com.george.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: abner-shen
 * @Date: 2020/12/22/15:11
 * @Description:
 */
@Mapper
public interface PaymentDao {
    int create(Payment payment);
    Payment getPaymentById(Long id);
}
