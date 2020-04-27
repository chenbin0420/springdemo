package com.dhcc.demo.di;

public class Sword extends BaseWeapon {
    @Override
    public String attack() {
        return "use sword";
    }

    public void init() {
        System.out.println("初始化...");
    }

    public void destroy() {
        System.out.println("已销毁...");
    }
}
