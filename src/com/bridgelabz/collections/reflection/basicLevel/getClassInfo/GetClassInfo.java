package com.bridgelabz.collections.reflection.basicLevel.getClassInfo;

public class GetClassInfo {
    private String name;
    private int age;

    public GetClassInfo(String name,int age) {
        this.name = name;
        this.age = age;
    }

    public void show(){
        System.out.println("GoodBye");
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}
