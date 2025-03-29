package com.bridgelabz.collections.annotaion.beginnerlevel.pendingtask;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        Class<MultipleMethod.ProjectTasks> obj = MultipleMethod.ProjectTasks.class;
        System.out.println("📌 Pending Tasks:");
        for (Method method : obj.getDeclaredMethods()) {
            if (method.isAnnotationPresent(Todo.class)) {
                Todo todo = method.getAnnotation(Todo.class);
                System.out.printf("🔹 Task: %s%n", todo.task());
                System.out.printf("   ➤ Method: %s%n", method.getName());
                System.out.printf("   ➤ Assigned To: %s%n", todo.assignedTo());
                System.out.printf("   ➤ Priority: %s%n%n", todo.priority());
            }
        }
    }
}
