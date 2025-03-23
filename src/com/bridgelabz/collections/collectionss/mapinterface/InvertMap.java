package com.bridgelabz.collections.collectionss.mapinterface;

import java.util.HashMap;

public class InvertMap {
    public static void main(String[] args) {
        HashMap<String,Integer> input=new HashMap<>();
        input.put("A",1);
        input.put("B",2);
        input.put("C",1);
        HashMap<Integer,String> ans=new HashMap<>();
        for(String s:input.keySet()){
            int val=input.get(s);
            if(ans.containsKey(val)){
                ans.put(val,ans.getOrDefault(val,s)+s);
            }else{
                ans.put(val,s);
            }

        }
        System.out.println(ans);
    }
}
