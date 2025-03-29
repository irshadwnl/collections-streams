package com.bridgelabz.collections.annotaion.intermediatelevel.loginmethod;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        PerformanceTest testObj = new PerformanceTest();
        Class<PerformanceTest> obj = PerformanceTest.class;

        for (Method method : obj.getDeclaredMethods()) {
            if (method.isAnnotationPresent(LogExecutionTime.class)) {
                long startTime = System.nanoTime(); // Start time
                method.invoke(testObj); // Invoke the method
                long endTime = System.nanoTime(); // End time

                long executionTime = endTime - startTime;
                System.out.printf("Method: %s | Execution Time: %d ns (%.3f ms)%n",
                        method.getName(), executionTime, executionTime / 1_000_000.0);
            }
        }
    }
}
