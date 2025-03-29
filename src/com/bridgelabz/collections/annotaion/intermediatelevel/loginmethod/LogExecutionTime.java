package com.bridgelabz.collections.annotaion.intermediatelevel.loginmethod;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME) // Retained at runtime for reflection
@Target(ElementType.METHOD) // Can be applied to methods
public @interface LogExecutionTime {

}
