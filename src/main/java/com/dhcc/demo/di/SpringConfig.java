package com.dhcc.demo.di;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class SpringConfig {

    @Bean(initMethod = "init", destroyMethod = "destory")
    @Scope("prototype")
    public AirPlane airPlane() {
        return new AirPlane();
    }

    @Bean
    @Scope("prototype")
    public Player player(){
        return new Player();
    }
}
