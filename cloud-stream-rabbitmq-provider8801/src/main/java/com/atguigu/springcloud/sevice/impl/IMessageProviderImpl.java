package com.atguigu.springcloud.sevice.impl;

import com.atguigu.springcloud.sevice.IMessageProvider;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.MessageChannel;

import java.util.UUID;

@EnableBinding(Source.class) //定义消息的推送管道
@Slf4j
public class IMessageProviderImpl implements IMessageProvider {

    @Autowired
    private MessageChannel output;

    @Override
    public String send() {
        String serial = UUID.randomUUID().toString();
        output.send(MessageBuilder.withPayload(serial).build());
        log.info("===============serial:" + serial);
        return null;
    }
}
