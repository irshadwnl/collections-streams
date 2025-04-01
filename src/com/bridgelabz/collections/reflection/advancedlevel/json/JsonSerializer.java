package com.bridgelabz.collections.reflection.advancedlevel.json;


import java.lang.reflect.Field;

public class JsonSerializer {
    public static String toJson(Object obj) {
        StringBuilder json = new StringBuilder();
        json.append("{");

        // Get the class of the object
        Class<?> clazz = obj.getClass();
        Field[] fields = clazz.getDeclaredFields();

        int fieldCount = 0;
        for (Field field : fields) {
            field.setAccessible(true); // Allow access to private fields
            try {
                Object value = field.get(obj);
                json.append("\"").append(field.getName()).append("\": ");

                // Handle different data types
                if (value instanceof String) {
                    json.append("\"").append(value).append("\"");
                } else {
                    json.append(value);
                }

                // Append a comma unless it's the last field
                if (++fieldCount < fields.length) {
                    json.append(", ");
                }
            } catch (IllegalAccessException e) {
                throw new RuntimeException("Error accessing field: " + field.getName(), e);
            }
        }

        json.append("}");
        return json.toString();
    }
}