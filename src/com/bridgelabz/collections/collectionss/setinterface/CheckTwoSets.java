package com.bridgelabz.collections.collectionss.setinterface;

import java.util.HashSet;

public class CheckTwoSets {
    public static void main(String[] args) {
        HashSet<Integer> set1=new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        HashSet<Integer> set2=new HashSet<>();
        set2.add(3);
        set2.add(2);
        set2.add(1);

        System.out.println(comapreTwoSets(set1,set2));

    }

    private static boolean comapreTwoSets(HashSet<Integer> set1, HashSet<Integer> set2) {
        if(set1.equals(set2)){
            return true;
        }
        return false;
    }
}
