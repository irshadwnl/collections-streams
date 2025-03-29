package com.bridgelabz.collections.annotaion.beginnerlevel.markImportant;
public class MethodClass {
    @ImportantMethod(level = "MEDIUM")
    public void m1(){
        System.out.println("executing medium task");
    }
    @ImportantMethod
    public void m2(){
        System.out.println("Executing default task");
    }
    @ImportantMethod(level = "LOW")
    public void m3(){
        System.out.println("Executing low task");
    }

}
