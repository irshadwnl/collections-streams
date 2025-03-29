package com.bridgelabz.collections.annotaion.overrideannotaion;

public class Dog extends Animal{
    @Override
    public void makeSound(){
        System.out.println("Bark");
    }
}
