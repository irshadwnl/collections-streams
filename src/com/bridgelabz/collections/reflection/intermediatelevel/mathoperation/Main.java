package com.bridgelabz.collections.reflection.intermediatelevel.mathoperation;

import java.lang.reflect.Method;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            // Create an instance of MathOperations
            MathOperation mathOperations = new MathOperation();
            Class<?> mathClass = mathOperations.getClass();

            // Take user input for method name and arguments
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter method name (add, subtract, multiply, divide): ");
            String methodName = scanner.nextLine();

            System.out.print("Enter first number: ");
            int num1 = scanner.nextInt();

            System.out.print("Enter second number: ");
            int num2 = scanner.nextInt();
            scanner.close();

            // Get the method dynamically
            Method method = mathClass.getMethod(methodName, int.class, int.class);

            // Invoke the method dynamically
            Object result = method.invoke(mathOperations, num1, num2);

            // Print the result
            System.out.println("Result: " + result);

        } catch (NoSuchMethodException e) {
            System.out.println("Error: Method not found!");
        } catch (Exception e) {
            System.out.println("Error: " + e.getCause());
        }
    }
}