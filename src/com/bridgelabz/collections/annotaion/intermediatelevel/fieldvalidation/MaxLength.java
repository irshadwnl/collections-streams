package com.bridgelabz.collections.annotaion.intermediatelevel.fieldvalidation;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME) // Retained at runtime for reflection
@Target(ElementType.FIELD) // Can be applied to fields
public @interface MaxLength {
    int value(); // Maximum allowed length
}

