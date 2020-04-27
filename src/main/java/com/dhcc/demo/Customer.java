package com.dhcc.demo;

/**
 * @auther chenbin
 */
public class Customer {

    /**
     * 客户名字
     */
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void showCustomerName() {
        System.out.println("Customer name : " + getName());
    }

    public void init(){
        System.out.println(" ********** Customer.init() ");
    }
}
