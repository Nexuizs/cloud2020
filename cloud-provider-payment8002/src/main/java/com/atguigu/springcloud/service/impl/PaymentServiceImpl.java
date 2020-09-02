package com.atguigu.springcloud.service.impl;

import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.mapper.PaymentMapper;
import com.atguigu.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class PaymentServiceImpl implements PaymentService{

    @Resource
    private PaymentMapper paymentMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return paymentMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Payment record) {
        return paymentMapper.insert(record);
    }

    @Override
    public int insertOrUpdate(Payment record) {
        return paymentMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(Payment record) {
        return paymentMapper.insertOrUpdateSelective(record);
    }

    @Override
    public int insertSelective(Payment record) {
        return paymentMapper.insertSelective(record);
    }

    @Override
    public Payment selectByPrimaryKey(Long id) {
        return paymentMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Payment record) {
        return paymentMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Payment record) {
        return paymentMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<Payment> list) {
        return paymentMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<Payment> list) {
        return paymentMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<Payment> list) {
        return paymentMapper.batchInsert(list);
    }

}
