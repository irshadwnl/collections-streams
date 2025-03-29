package com.bridgelabz.collections.annotaion;

import java.util.ArrayList;

public class suppressedAnnotation {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        ArrayList al=new ArrayList();
        al.add("hii");
        al.add(2);
        al.add(true);
    }
}
