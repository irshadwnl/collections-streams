package com.bridgelabz.collections.reflection.advancedlevel.json;

public class Main {
    public static void main(String[] args) {
        // Create a sample user object
        User user = new User("Mohit", 25, true);

        // Convert object to JSON string
        String jsonString = JsonSerializer.toJson(user);

        // Print the JSON output
        System.out.println(jsonString);
    }
}