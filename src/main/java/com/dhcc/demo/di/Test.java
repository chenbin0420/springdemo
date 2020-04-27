package com.dhcc.demo.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

    public static void main(String[] args) {

//        Player player = new Player( new Sword() );
//        player.setName("player01 ");
//        System.out.println(player.attack());

        /*
         *  applicationContext加载beans.xml文件，并根据xml中配置创建所需bean
         *  getBean() 获取bean对象
         *  xxx.close() 关闭applicationContext对象，释放资源
         */
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        // Exception in thread "main" org.springframework.beans.factory.NoSuchBeanDefinitionException: No bean named 'playerBean' available
        // 测试 bean 中 lazy-init=true
//        Customer customer = (Customer)applicationContext.getBean("customerBean");
//        Player player2 = (Player)applicationContext.getBean("player2Bean");
//        Player player3 = (Player)applicationContext.getBean("player3Bean");
//        System.out.println(player2.attack());
//        System.out.println(player3.attack());
//        ((ClassPathXmlApplicationContext)applicationContext).close();

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext( SpringConfig.class );
        AirPlane airPlane = (AirPlane)applicationContext.getBean("airPlane" , AirPlane.class );
        System.out.println( airPlane.attack() );
        Player player = (Player)applicationContext.getBean("player" , Player.class );
        System.out.println( player.attack() );
        ((AnnotationConfigApplicationContext)applicationContext).close();
    }

    /**
     * Stick stick = (Stick) applicationContext.getBean("stick");
     * System.out.println(stick.attack());
     */


}
