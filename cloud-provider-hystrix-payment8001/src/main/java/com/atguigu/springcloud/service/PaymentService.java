package com.atguigu.springcloud.service;

import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

@Service
public class PaymentService {

    public String paymentInfo_OK(Integer id){
        return "线程池" + Thread.currentThread().getName() + "paymentInfo_OK，id:" + id + "\t" + "阿斯达克捡垃圾的卡拉时间";
    }

    public String paymentInfo_TimeOut(Integer id){
        try{TimeUnit.SECONDS.sleep(id);}catch(Exception e){e.printStackTrace();}
        return "线程池" + Thread.currentThread().getName() + "paymentInfo_OK，id:" + id + "\t" + "阿斯达克捡垃圾的卡拉时间"
                + "耗时" + id + "秒钟";
    }

}
