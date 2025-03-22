package com.bridgelabz.collections.collectionss.listinterface;

import java.util.LinkedList;
import java.util.List;

public class FindNthFromEnd {
    public static void main(String[] args) {
        LinkedList<Character> list=new LinkedList<>();
        list.add('A');
        list.add('B');
        list.add('C');
        list.add('D');
        list.add('E');

        int n=2;

//        System.out.println(list.get(list.size()-n));

        for(int i=list.size()-1;i>=0;i--){
            n--;
            if(n==0) {
                System.out.println(list.get(i));
                break;
            }
        }
    }
}
