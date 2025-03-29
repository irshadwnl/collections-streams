package com.bridgelabz.collections.annotaion.advancedlevel.rolebasedaccess;

public class SecureService {

    @RoleAllowed("ADMIN")
    public void adminTask() {
        System.out.println("Admin task executed successfully!");
    }

    @RoleAllowed("USER")
    public void userTask() {
        System.out.println("User task executed successfully!");
    }

    public void openTask() {
        System.out.println("Open task executed. No restrictions.");
    }
}
