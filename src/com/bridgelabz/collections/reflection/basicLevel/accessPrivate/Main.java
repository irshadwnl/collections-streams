package com.bridgelabz.collections.reflection.basicLevel.accessPrivate;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) {
        try {
            // Create an instance of Person
            Person person = new Person(25);

            // Get the 'age' field using Reflection
            Field f = person.getClass().getDeclaredField("age");

            // Make the private field accessible
            f.setAccessible(true);

            // Retrieve the current value
            System.out.println("Before modification: Age = " + f.get(person));

            // Modify the value
            f.set(person, 30);

            // Retrieve and print the modified value
            System.out.println("After modification: Age = " + f.get(person));

            // Call displayAge() to verify change
            person.displayAge();

        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
