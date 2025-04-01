package com.bridgelabz.collections.reflection.basicLevel.invokePrivate;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        try{
            Calculator c=new Calculator();
            Method mul=c.getClass().getDeclaredMethod("multiply", int.class, int.class);
            mul.setAccessible(true);
            int ans=(int)mul.invoke(c,15,10);
            System.out.println(ans);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
