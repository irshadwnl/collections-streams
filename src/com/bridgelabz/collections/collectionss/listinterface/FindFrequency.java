package com.bridgelabz.collections.collectionss.listinterface;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FindFrequency {
    public static void main(String[] args) {
        List<String> list =new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("orange");
        list.add("apple");

        HashMap<String,Integer> map=new HashMap<>();
        for(String l:list){
            if(map.containsKey(l)){
                map.put(l,map.getOrDefault(l,0)+1);
            }else{
                map.put(l,1);
            }
        }
        System.out.println(map);
    }
}
