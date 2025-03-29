package com.bridgelabz.collections.annotaion.annoExample;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Comparator;

public class AnnotationTest {
    public static void main(String[] args) {
        System.out.println("Processing...");
        int succes = 0, failed = 0, total = 0, disabled = 0;
        Class<AnnotationExample> obj = AnnotationExample.class;
//        process @CustomTypeAnnotation
        if (obj.isAnnotationPresent(CustomTypeAnnotation.class)) {
            Annotation an = obj.getAnnotation(CustomTypeAnnotation.class);
            CustomTypeAnnotation custom = (CustomTypeAnnotation) an;

            System.out.printf("%nPriority :%s", custom.priority());
            System.out.printf("%nCreated By : %s", custom.createdBy());
            System.out.printf("%n Tags :");

            int len = custom.tags().length;
            for (String t : custom.tags()) {
                if (len > 1) {
                    System.out.println(t + ",");
                } else {
                    System.out.println(t);
                }
                len--;
            }
            System.out.printf("%nLastModified :%s%n%n", custom.lastModified());
        }

//        process @CustomMethodAnnotation

        for (Method method : obj.getDeclaredMethods()) {
            if (method.isAnnotationPresent(CustomMethodAnnotation.class)) {
                Annotation an = method.getAnnotation(CustomMethodAnnotation.class);
                CustomMethodAnnotation customMethod = (CustomMethodAnnotation) an;
                if (customMethod.enabled()) {
                    String result = "n/a";
                    try {
                        result = (String) method.invoke(obj.newInstance());
                        System.out.printf("%s -CustomMethod '%s' -processed%n -result: %s%n", ++total, method.getName(), result);
                        succes++;
                    } catch (Throwable ex) {
                        System.out.printf("%s -CustomMethod '%s' -didn't process %s %n", ++total, method.getName(), ex.getCause());
                        failed++;
                    }
                } else {
                    System.out.printf("%s -customMethod '%s' -didn't process%n", ++total, method.getName());
                    disabled++;
                }
            }
        }
        System.out.printf("%nResult: Total: %d, Successful: %d, Failed %d, Disabled %d%n",total,succes,failed,disabled);
    }

}
