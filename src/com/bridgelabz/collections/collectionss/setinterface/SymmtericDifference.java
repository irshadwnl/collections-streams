package com.bridgelabz.collections.collectionss.setinterface;

import java.util.HashSet;

public class SymmtericDifference {
    public static void main(String[] args) {
        HashSet<Integer> set1=new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        HashSet<Integer> set2=new HashSet<>();
        set2.add(3);
        set2.add(4);
        set2.add(5);
        set2.add(1);
        set2.add(6);

        HashSet<Integer> sym=new HashSet<>();
        for(int i:set1){
            sym.add(i);
        }
        for(int i:set2){
            if(sym.contains(i)) {
                sym.remove(i);
            }else{
                sym.add(i);
            }
        }

        System.out.println("Symmetric Difference is: "+sym);
    }
}
