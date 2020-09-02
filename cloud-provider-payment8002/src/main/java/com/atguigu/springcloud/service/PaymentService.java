package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entities.Payment;

import java.util.List;

public interface PaymentService{


    int deleteByPrimaryKey(Long id);

    int insert(Payment record);

    int insertOrUpdate(Payment record);

    int insertOrUpdateSelective(Payment record);

    int insertSelective(Payment record);

    Payment selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Payment record);

    int updateByPrimaryKey(Payment record);

    int updateBatch(List<Payment> list);

    int updateBatchSelective(List<Payment> list);

    int batchInsert(List<Payment> list);

}
