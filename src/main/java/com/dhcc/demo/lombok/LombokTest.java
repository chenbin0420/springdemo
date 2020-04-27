package com.dhcc.demo.lombok;

public class LombokTest {
    public static void main(String[] args) {
        UserPO userPO = new UserPO();
        userPO.setId(111);
        userPO.setFirstName("三");
        System.out.println( userPO.getId() );
        System.out.println( userPO.getFirstName());

        userPO.setHeight( 1.7 );
        System.out.println( userPO.getHeight() );
        System.out.println(userPO);
        System.out.println(userPO.getLastName());
    }
}
