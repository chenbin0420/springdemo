package com.dhcc.demo.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 玩家类
 */
@Component
public class Player extends BaseWeapon {

    private String name;

//    @Autowired
//    @Qualifier("stickBean")
    private BaseWeapon weapon;

//    public Player() {
//        this.weapon = new Sword();
//    }


    public Player() {
    }

    /**
     * 使用 Spring 解耦合
     * 构造器 @Autowired
     * 属性方式 : 属性、setter()上方 @Autowired @Qualifier("value")
     *           与Stick类中@Qualifier("stickBean") value=stickBean 或 value = stick
     *  如果多个实现类，需要使用@Qualifier("bean_id")注解显式指定。
     * @param weapon
     * Caused by: org.springframework.beans.factory.NoUniqueBeanDefinitionException:
     * No qualifying bean of type 'com.dhcc.demo.di.BaseWeapon'
     * available: expected single matching bean but found 4: swordBean,gunBean,player3Bean,stick
     *
     * @Qualifier("stick") 不能作用在构造器上
     */
    public Player(BaseWeapon weapon) {
        this.weapon = weapon;
    }

    @Autowired
//    @Qualifier("stick")
    public void setWeapon(BaseWeapon weapon) {
        this.weapon = weapon;
    }

    @Override
    public String attack() {
        return getName() + this.weapon.attack();
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
