package com.bridgelabz.collections.collectionss.setinterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class ConvertSetToSorted {
    public static void main(String[] args) {
        HashSet<Integer> set=new HashSet<>();
        set.add(5);
        set.add(3);
        set.add(9);
        set.add(1);

        List<Integer> list=new ArrayList<>(set);
        Collections.sort(list);

        System.out.println(list);
    }
}
