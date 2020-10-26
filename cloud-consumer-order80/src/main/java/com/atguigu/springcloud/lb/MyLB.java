package com.atguigu.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@Component
public class MyLB implements LoadBalancer{

    private AtomicInteger atomicInteger = new AtomicInteger(0);

    public final int getAndIncrement(){
        int current;
        int next;
        do {
            current = this.atomicInteger.get();
            next = current >= 2147483647 ? 0 : current + 1;
        }while (!this.atomicInteger.compareAndSet(current, next));
        // 刚开始没有加！，主线程进入死循环，页面访问不到，第二次访问时另一个线程进来了，会有跳出循环的情况，但是访问次数非常大，而且变成了随机的算法了
        System.out.println("===========第几次访问next，访问次数：" + next);
        return next;
    }

    @Override
    public ServiceInstance instance(List<ServiceInstance> serviceInstances) {
        int size = serviceInstances.size();
        int index = getAndIncrement() % size;
        return serviceInstances.get(index);
    }
}
