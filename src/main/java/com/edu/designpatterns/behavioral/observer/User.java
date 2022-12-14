package com.edu.designpatterns.behavioral.observer;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class User{
    private String id;
    private String userName;
    private String firstName;
    private String lastName;
    private String age;
    private String email;
    private String phoneNumber;

}