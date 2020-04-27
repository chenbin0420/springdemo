package com.dhcc.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClass {
    public static void main(String[] args) {
        /**
         * ApplicationContext 使用父类提高代码可维护性、可拓展性
         */
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        Customer customer = (Customer)applicationContext.getBean("customerBean");
        customer.showCustomerName();

        ((ClassPathXmlApplicationContext)applicationContext).close();
    }
}
