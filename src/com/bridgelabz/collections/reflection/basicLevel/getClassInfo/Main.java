package com.bridgelabz.collections.reflection.basicLevel.getClassInfo;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        GetClassInfo obj=new GetClassInfo("Mohit",19);
        Field[] field= obj.getClass().getDeclaredFields();

        for(Field f:field){
            System.out.println(f.getName());
        }

        for(Method m:obj.getClass().getDeclaredMethods()){
            System.out.println(m.getName());
        }

        Constructor<?>[] cons=obj.getClass().getDeclaredConstructors();
        for(Constructor <?>c:cons){
            System.out.println(c.getName());
        }

    }
}
