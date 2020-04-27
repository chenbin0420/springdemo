package com.dhcc.demo.aop;

public class User {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void print() {
        System.out.println("id:" + id + ",name:" + name);
    }

    public void printThrowException() {
        System.out.println("Exception raised");
        throw new IllegalArgumentException("exception");
    }
}
