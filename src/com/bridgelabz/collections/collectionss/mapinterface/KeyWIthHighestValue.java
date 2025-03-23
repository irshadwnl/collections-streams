package com.bridgelabz.collections.collectionss.mapinterface;

import java.util.HashMap;

public class KeyWIthHighestValue {
    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();
        map.put("A",10);
        map.put("B",20);
        map.put("C",15);
        int max=Integer.MIN_VALUE;
        String ans="";
        for(String s: map.keySet()){
            int val= map.get(s);
            if(val>max){
                max=val;
                ans=s;
            }
        }
        System.out.println(ans);

    }
}
