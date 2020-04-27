package com.dhcc.demo.di;

public class AirPlane extends BaseWeapon {
    @Override
    public String attack() {
        return "use airPlane";
    }

    public void init() {
        System.out.println("AirPlane.init()");
    }

    public void destory() {
        System.out.println("AirPlane.destory()");
    }
}
