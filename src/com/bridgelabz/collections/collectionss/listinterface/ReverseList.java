package com.bridgelabz.collections.collectionss.listinterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseList {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        reverse(list);
        System.out.println(list);
    }

    private static void reverse(List<Integer> list) {
        int i=0;
        int j=list.size()-1;
        while(i<=j){
            int swap=list.get(i);
            list.set(i, list.get(j));
            list.set(j,swap);
            i++;
            j--;
        }
    }
}
