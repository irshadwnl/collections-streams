package com.bridgelabz.collections.reflection.advancedlevel.customobject;


public class User {
    private String name;
    private int age;
    private String email;

    // Default constructor is required for Reflection
    public User() {}

    public void displayUser() {
        System.out.println("User Details: Name = " + name + ", Age = " + age + ", Email = " + email);
    }
}
