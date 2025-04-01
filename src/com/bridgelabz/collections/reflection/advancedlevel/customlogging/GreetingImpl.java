package com.bridgelabz.collections.reflection.advancedlevel.customlogging;

public class GreetingImpl implements Greeting {
    @Override
    public void sayHello(String name) {
        System.out.println("Hello, " + name + "!");
    }
}