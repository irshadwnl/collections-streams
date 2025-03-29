package com.bridgelabz.collections.annotaion.customanno;

public class TaskManager {
    @TaskInfo(priority = "Urgent",assignedTo = "Mohit")
    public void completeTask(){
        System.out.println("Task Completed");
    }
}
