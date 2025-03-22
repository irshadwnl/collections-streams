package com.bridgelabz.collections.collectionss.listinterface;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RotateElement {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        int n=list.size();
        k=k%n;
        List<Integer> ans = new ArrayList<>();
        ans.addAll(list.subList(n - k, n)); // Add last k elements
        ans.addAll(list.subList(0, n - k)); // Add first (n-k) elements

        System.out.println(ans);

    }
}
