package com.bridgelabz.collections.collectionss.setinterface;

import java.util.HashSet;

public class UnionAndInteraction {
    public static void main(String[] args) {
        HashSet<Integer> set1=new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        HashSet<Integer> set2=new HashSet<>();
        set2.add(3);
        set2.add(4);
        set2.add(5);
        int intersection=-1;
        HashSet<Integer> union=new HashSet<>();
        for(int i:set1){
            union.add(i);
        }
        for(int i:set2){
            if(union.contains(i)){
                intersection=i;
            }
            union.add(i);
        }

        System.out.println("Union is: "+union);
        System.out.println("Intersection is: "+intersection);
    }
}
