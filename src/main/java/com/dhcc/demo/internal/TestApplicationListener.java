package com.dhcc.demo.internal;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestApplicationListener {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("aop-config.xml");
        ((ClassPathXmlApplicationContext) applicationContext).start();
    }
}
