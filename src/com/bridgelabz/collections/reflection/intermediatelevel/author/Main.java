package com.bridgelabz.collections.reflection.intermediatelevel.author;

import java.lang.annotation.Annotation;

public class Main {
    public static void main(String[] args) {
        // Get the class object of Book
        Class<Book> bookClass = Book.class;

        // Check if the @Author annotation is present
        if (bookClass.isAnnotationPresent(Author.class)) {
            // Retrieve the annotation
            Author authorAnnotation = bookClass.getAnnotation(Author.class);

            // Print the annotation value
            System.out.println("Author of the Book: " + authorAnnotation.name());
        } else {
            System.out.println("No @Author annotation found.");
        }
    }
}