package com.bridgelabz.collections.annotaion.advancedlevel.rolebasedaccess;

import java.lang.reflect.Method;

public class AccessController {

    public static void invokeMethod(User user, SecureService service, String methodName) {
        try {
            Method method = SecureService.class.getMethod(methodName);

            if (method.isAnnotationPresent(RoleAllowed.class)) {
                RoleAllowed roleAllowed = method.getAnnotation(RoleAllowed.class);
                if (!user.getRole().equals(roleAllowed.value())) {
                    System.out.println("Access Denied! " + user.getUsername() + " does not have " + roleAllowed.value() + " role.");
                    return;
                }
            }

            method.invoke(service); // Invoke method if access is granted
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

