package com.dhcc.demo.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

public class CustomerEventPublisher implements ApplicationEventPublisherAware {

    /**
     * @Autowired
     */
    private ApplicationEventPublisher publisher;

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.publisher = applicationEventPublisher;
    }

    /**
     * 发布方法
     */
    public void publish(){
        // 自定义事件
        CustomerEvent event = new CustomerEvent(this);
        /*
           发布自定义事件
         */
        publisher.publishEvent( event );
    }
}
