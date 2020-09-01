package com.atguigu.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("com.atguigu.springcloud.mapper")
public class PayMentMain8001 {

    public static void main(String[] args) {
        SpringApplication.run(PayMentMain8001.class, args);
    }
}
