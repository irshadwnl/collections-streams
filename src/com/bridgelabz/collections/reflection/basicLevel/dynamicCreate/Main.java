package com.bridgelabz.collections.reflection.basicLevel.dynamicCreate;


public class Main {
    public static void main(String[] args) {
        try {
            // Load the Student class dynamically
            Class<?> studentClass = Class.forName("com.bridgelabz.collections.reflection.basicLevel.dynamicCreate.Student");

            // Create an instance using the default constructor
            Object studentObj = studentClass.getDeclaredConstructor().newInstance();

            // Invoke the display method to verify the object creation
            studentClass.getMethod("display").invoke(studentObj);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

