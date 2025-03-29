package com.bridgelabz.collections.annotaion.customanno;
import java.lang.annotation.*;
import java.lang.reflect.Method;
public class Main {
    public static void main(String[] args) {
        Class<TaskManager> obj = TaskManager.class;

        // Iterate through methods to find annotated ones
        for (Method method : obj.getDeclaredMethods()) {
            // Check if TaskInfo annotation is present
            if (method.isAnnotationPresent(TaskInfo.class)) {
                // Retrieve annotation details
                TaskInfo taskInfo = method.getAnnotation(TaskInfo.class);
                System.out.println("Method: " + method.getName());
                System.out.println("Priority: " + taskInfo.priority());
                System.out.println("Assigned To: " + taskInfo.assignedTo());
            }
        }

    }
}
