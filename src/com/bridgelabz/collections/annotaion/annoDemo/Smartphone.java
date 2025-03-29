package com.bridgelabz.collections.annotaion.annoDemo;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//These two are  meta annotation
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface Smartphone {
    String os() default "Symbian";
    int version() default 1;
}
