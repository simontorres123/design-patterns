package com.edu.designpatterns.creational;

import lombok.Data;
import org.springframework.util.ObjectUtils;

@Data
public class Singleton {

    private static Singleton instance;
    private Singleton() {
    }

    public static Singleton getInstance(){
        if(ObjectUtils.nullSafeEquals(instance,null)){
            return instance = new Singleton();
        }
            return instance;
    }
}
