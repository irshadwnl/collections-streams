package com.bridgelabz.collections.annotaion.bugreport;

public class Software {
    @BugReport(description = "Arithmetic exception: Cannot divide by zero")
    @BugReport(description = "Memory leak issue on large data processing")
    public void processData() {
        System.out.println("Processing data...");
    }
}
