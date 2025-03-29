package com.bridgelabz.collections.annotaion.advancedlevel.rolebasedaccess;

public class Main {
    public static void main(String[] args) {
        User admin = new User("Alice", "ADMIN");
        User normalUser = new User("Bob", "USER");

        SecureService service = new SecureService();

        System.out.println("\n🔹 Attempting admin task as ADMIN:");
        AccessController.invokeMethod(admin, service, "adminTask");

        System.out.println("\n🔹 Attempting admin task as USER:");
        AccessController.invokeMethod(normalUser, service, "adminTask");

        System.out.println("\n🔹 Attempting user task as USER:");
        AccessController.invokeMethod(normalUser, service, "userTask");

        System.out.println("\n🔹 Attempting open task as USER:");
        AccessController.invokeMethod(normalUser, service, "openTask");
    }
}

