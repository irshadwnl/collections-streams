package com.bridgelabz.collections.annotaion.intermediatelevel.fieldvalidation;

public class Main {
    public static void main(String[] args) {
        try {
            User user1 = new User("JohnDoe"); // Valid
            System.out.println("Created user: " + user1.getUsername());

            User user2 = new User("LongUsername123"); // Invalid (too long)
            System.out.println("Created user: " + user2.getUsername());
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
