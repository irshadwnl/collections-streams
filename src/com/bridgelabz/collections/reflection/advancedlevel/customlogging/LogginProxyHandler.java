package com.bridgelabz.collections.reflection.advancedlevel.customlogging;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

// Step 3: Create a dynamic proxy handler
public class LogginProxyHandler implements InvocationHandler {
    private final Object target;

    public LogginProxyHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // Log the method name before execution
        System.out.println("Executing method: " + method.getName());

        // Call the original method
        return method.invoke(target, args);
    }

    // Utility method to create a proxy instance
    public static <T> T createProxy(T target, Class<T> interfaceType) {
        return (T) Proxy.newProxyInstance(
                interfaceType.getClassLoader(),
                new Class<?>[]{interfaceType},
                new LogginProxyHandler(target)
        );
    }
}