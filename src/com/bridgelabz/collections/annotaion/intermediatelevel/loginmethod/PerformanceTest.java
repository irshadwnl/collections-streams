package com.bridgelabz.collections.annotaion.intermediatelevel.loginmethod;

public class PerformanceTest {

    @LogExecutionTime
    public void fastMethod() {
        int sum = 0;
        for (int i = 0; i < 1000; i++) {
            sum += i;
        }
        System.out.println("Fast method executed.");
    }

    @LogExecutionTime
    public void slowMethod() {
        try {
            Thread.sleep(500); // Simulating a delay
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Slow method executed.");
    }

    public void normalMethod() {
        System.out.println("This method is not logged.");
    }
}

