package com.bridgelabz.collections.annotaion.advancedlevel.customeSerialization;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class JsonSerializer {

    public static String serialize(Object obj) throws IllegalAccessException {
        Class<?> objClass = obj.getClass();
        Map<String, String> jsonElements = new HashMap<>();

        for (Field field : objClass.getDeclaredFields()) {
            field.setAccessible(true);

            if (field.isAnnotationPresent(JsonField.class)) {
                JsonField annotation = field.getAnnotation(JsonField.class);
                jsonElements.put(annotation.name(), field.get(obj).toString());
            }
        }

        StringBuilder json = new StringBuilder("{\n");
        for (Map.Entry<String, String> entry : jsonElements.entrySet()) {
            json.append(String.format("  \"%s\": \"%s\",\n", entry.getKey(), entry.getValue()));
        }
        if (jsonElements.size() > 0) {
            json.deleteCharAt(json.length() - 2); // Remove last comma
        }
        json.append("}");

        return json.toString();
    }
}
