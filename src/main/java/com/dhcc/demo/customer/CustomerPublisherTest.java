package com.dhcc.demo.customer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CustomerPublisherTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext =  new ClassPathXmlApplicationContext("customer.xml");
        CustomerEventPublisher customerEventPublisher =(CustomerEventPublisher)applicationContext.getBean("customerEventPublisher");
        customerEventPublisher.publish();
    }
}
