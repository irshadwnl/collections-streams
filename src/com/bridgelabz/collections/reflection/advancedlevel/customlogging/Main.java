package com.bridgelabz.collections.reflection.advancedlevel.customlogging;

public class Main {
    public static void main(String[] args) {
        // Create a proxy instance for Greeting
        Greeting greeting = LogginProxyHandler.createProxy(new GreetingImpl(), Greeting.class);

        // Invoke the method (should log before execution)
        greeting.sayHello("Mohit");
    }
}
