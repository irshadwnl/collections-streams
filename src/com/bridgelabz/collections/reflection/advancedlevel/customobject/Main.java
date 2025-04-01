package com.bridgelabz.collections.reflection.advancedlevel.customobject;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Create a map with field names as keys and values to be set
        Map<String, Object> properties = new HashMap<>();
        properties.put("name", "Mohit");
        properties.put("age", 25);
        properties.put("email", "mohit@example.com");

        // Convert map to User object
        User user = ObjectMapper.toObject(User.class, properties);

        // Display user details
        user.displayUser();
    }
}