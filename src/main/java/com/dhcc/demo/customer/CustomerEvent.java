package com.dhcc.demo.customer;

import org.springframework.context.ApplicationEvent;

public class CustomerEvent extends ApplicationEvent {

    public CustomerEvent(Object source) {
        super(source);
    }

    @Override
    public String toString() {
        return "自定义事件";
    }
}
