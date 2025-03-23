package com.bridgelabz.collections.collectionss.mapinterface;

import java.util.HashMap;

public class MergeTwoMaps {
    public static void main(String[] args) {
        HashMap<String , Integer> map=new HashMap<>();
        HashMap<String ,Integer> map2=new HashMap<>();
        map.put("A",1);
        map.put("B",2);
        map2.put("B",3);
        map2.put("C",4);
        HashMap<String ,Integer> ans=new HashMap<>(map);
        for(String s: map2.keySet()){
            if(ans.containsKey(s)){
                ans.put(s,map.getOrDefault(s,map.get(s))+map2.get(s));
            }else{
                ans.put(s,map2.get(s));
            }
        }

        System.out.println(ans);

    }
}
