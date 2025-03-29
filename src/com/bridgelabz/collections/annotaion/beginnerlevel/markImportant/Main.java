package com.bridgelabz.collections.annotaion.beginnerlevel.markImportant;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        Class<MethodClass> obj= MethodClass.class;
        for(Method m: obj.getDeclaredMethods()){
            if(m.isAnnotationPresent(ImportantMethod.class)){
                ImportantMethod imp=m.getAnnotation(ImportantMethod.class);
                System.out.printf("Method: %s | Importance Level: %s%n", m.getName(), imp.level());
            }
        }
    }
}
