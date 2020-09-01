package com.atguigu.springcloud.mapper;

import com.atguigu.springcloud.entities.Payment;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PaymentMapper {
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

    int batchInsert(@Param("list") List<Payment> list);
}