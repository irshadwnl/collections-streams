package com.bridgelabz.collections.collectionss.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class GenerateBinaryNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Queue<String> q=new LinkedList<>();
        for(int i=1;i<=n;i++){
            String binary=Integer.toBinaryString(i);
            q.add(binary);
        }
        System.out.println(q);
    }
}
