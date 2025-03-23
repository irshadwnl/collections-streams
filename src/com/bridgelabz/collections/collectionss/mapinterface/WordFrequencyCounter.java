package com.bridgelabz.collections.collectionss.mapinterface;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class WordFrequencyCounter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();

        String arr[]=str.split("[^a-zA-Z0-9_.]+");
//        System.out.println(Arrays.toString(arr));

        HashMap<String ,Integer> map =new HashMap<>();
        for(String s:arr){
            if(map.containsKey(s)){
                map.put(s,map.getOrDefault(s,0)+1);
            }else{
                map.put(s,1);
            }
        }

        System.out.println(map);
    }
}
