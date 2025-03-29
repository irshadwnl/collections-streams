package com.bridgelabz.collections.annotaion.advancedlevel.customeSerialization;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        User user = new User("Alice", 25, "alice@example.com");

        String json = JsonSerializer.serialize(user);
        System.out.println("Generated JSON:\n" + json);
    }
}

