package com.bridgelabz.collections.collectionss.listinterface;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicates {
    public static void main(String[] args) {
        List<Integer> list =new ArrayList<>();
        list.add(3);
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(4);
        List<Integer> ans =new ArrayList<>();
        for(int i:list){
            if(ans.contains(i)){
                continue;
            }
            ans.add(i);
        }
        System.out.println(ans);
    }
}
