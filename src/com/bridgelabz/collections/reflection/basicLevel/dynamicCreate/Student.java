package com.bridgelabz.collections.reflection.basicLevel.dynamicCreate;

//package com.bridgelabz.collections.reflection.createObject;

public class Student {
    private String name;
    private int age;

    // Default Constructor
    public Student() {
        this.name = "Default Name";
        this.age = 18;
    }

    // Parameterized Constructor
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("Student Name: " + name + ", Age: " + age);
    }
}
