package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @Value("${server.port}")
    private String port;

    @PostMapping(value = "/payment/create")
    public CommonResult create(@RequestBody Payment payment){
        int insert = paymentService.insert(payment);
        log.info("===========插入结果：" + insert);
        if(insert > 0){
            return new CommonResult(200, "插入数据成功" + port, insert);
        }else{
            return new CommonResult(444, "插入数据失败", null);
        }
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id){
        Payment payment = paymentService.selectByPrimaryKey(id);
        log.info("===========查询结果：" + payment);
        if(payment != null){
            return new CommonResult(200, "查询数据成功" + port, payment);
        }else{
            return new CommonResult(444, "查询无对应记录", null);
        }
    }

    @GetMapping(value = "/payment/lb")
    public String getPaymentLB(){
        return port;
    }
}
