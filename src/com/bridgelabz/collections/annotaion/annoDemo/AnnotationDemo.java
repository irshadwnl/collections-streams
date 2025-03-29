package com.bridgelabz.collections.annotaion.annoDemo;

import java.lang.annotation.Annotation;

public class AnnotationDemo {
    public static void main(String[] args) {
        NokiaSeries ns=new NokiaSeries("Fire",5);
        Class c=ns.getClass();
        Annotation an=c.getAnnotation(Smartphone.class);
        Smartphone s=(Smartphone) an;
        System.out.println(s.os());
    }
}
