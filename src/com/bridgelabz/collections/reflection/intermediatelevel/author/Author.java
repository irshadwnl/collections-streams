package com.bridgelabz.collections.reflection.intermediatelevel.author;


import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

// Define the custom annotation
@Retention(RetentionPolicy.RUNTIME)  // Make it available at runtime
public @interface Author {
    String name();
}