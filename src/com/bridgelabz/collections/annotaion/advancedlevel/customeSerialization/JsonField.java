package com.bridgelabz.collections.annotaion.advancedlevel.customeSerialization;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME) // Retained at runtime for reflection
@Target(ElementType.FIELD) // Can be applied to fields
public @interface JsonField {
    String name(); // Custom JSON key name
}
