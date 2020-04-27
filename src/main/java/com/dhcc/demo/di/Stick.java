package com.dhcc.demo.di;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
/**
 * @Lazy 懒加载
 */
//@Lazy
/**
 * @Scope
 * singleton
 * prototype
 */
@Scope("singleton")
/**
 * @Qualifier
 * 默认是通过byType
 * 使用 Qualifier 是使用byName
 */
@Qualifier("stickBean")
public class Stick extends BaseWeapon {

    @Value("123")
    private int id;

    @Override
    public String attack() {
        return "use stick";
    }

    @PostConstruct
    public void init(){
        System.out.println("@PostConstruct" + this.id);
    }

    @PreDestroy
    public void destroy(){
        System.out.println("@PreDestroy" + this.id);
    }


}
