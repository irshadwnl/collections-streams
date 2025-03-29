package com.bridgelabz.collections.annotaion.beginnerlevel.pendingtask;

public class MultipleMethod {
    public class ProjectTasks {

        @Todo(task = "Implement login authentication", assignedTo = "Mohit", priority = Todo.Priority.HIGH)
        public void loginFeature() {
            System.out.println("Login feature in progress...");
        }

        @Todo(task = "Optimize database queries", assignedTo = "Sam")
        public void optimizeDatabase() {
            System.out.println("Database optimization in progress...");
        }

        @Todo(task = "Refactor payment module", assignedTo = "David", priority = Todo.Priority.MEDIUM)
        public void paymentFeature() {
            System.out.println("Payment feature refactoring...");
        }

        public void completedFeature() {
            System.out.println("This feature is already done.");
        }
    }

}
