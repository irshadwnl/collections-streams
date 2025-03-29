package com.bridgelabz.collections.annotaion.beginnerlevel.pendingtask;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Todo {
    String [] task() default "";
    String assignedTo() default "Irshad";
    public enum Priority{
        LOW,MEDIUM,HIGH
    }
    Priority priority() default Priority.MEDIUM;

}
