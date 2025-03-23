package com.bridgelabz.collections.collectionss.setinterface;

import java.util.HashSet;

public class CheckSubset {
    public static void main(String[] args) {
        HashSet<Integer> set1=new HashSet<>();
        set1.add(2);
        set1.add(3);

        HashSet<Integer> set2=new HashSet<>();
        set2.add(1);
        set2.add(2);
        set2.add(3);
        set2.add(4);

        System.out.println(checkSubset(set1,set2));
    }

    private static boolean checkSubset(HashSet<Integer> set1, HashSet<Integer> set2) {
        if(set1.size() > set2.size()){
            return false;
        }
        for(int i:set1){
            if(!set2.contains(i)){
                return false;
            }
        }
        return true;
    }
}
