package com.bridgelabz.collections.annotaion.bugreport;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException {
        Method m=Software.class.getMethod("processData");
        if (m.isAnnotationPresent(BugReports.class)) {
            // Retrieve all BugReports
            BugReports reports = m.getAnnotation(BugReports.class);

            System.out.println("Bug Reports for method: processData");
            for (BugReport bug : reports.value()) {
                System.out.println("Description: " + bug.description());
            }
        }
    }
}
