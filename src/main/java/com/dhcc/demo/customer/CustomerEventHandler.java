package com.dhcc.demo.customer;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

public class CustomerEventHandler implements ApplicationListener<ApplicationEvent> {
    @Override
    public void onApplicationEvent(ApplicationEvent applicationEvent) {
        System.out.println("收到事件："+applicationEvent.toString());
    }
}
