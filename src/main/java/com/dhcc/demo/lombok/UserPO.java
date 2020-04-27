package com.dhcc.demo.lombok;


import lombok.*;

@ToString( of = { "id","firstName" },exclude = {"lastName"})
@Getter( value = AccessLevel.PUBLIC )
@Setter( value = AccessLevel.PUBLIC )
public class UserPO {
    private int id;
    private String firstName;
    @NonNull  private String lastName;
    private int age;
    @Getter @Setter private Character gender;
    @Getter private double height;
}
