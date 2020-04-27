package com.dhcc.demo.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAop {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("aop-config.xml");
        User user = (User) applicationContext.getBean("user");
        user.print();
        System.out.println(user.getId());
        user.printThrowException();
        ((ClassPathXmlApplicationContext) applicationContext).close();
    }
}
