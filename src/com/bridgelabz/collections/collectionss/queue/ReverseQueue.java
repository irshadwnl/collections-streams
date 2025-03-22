package com.bridgelabz.collections.collectionss.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseQueue {
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        Stack<Integer> st=new Stack<>();
//        Queue<Integer> reversedQueue=new LinkedList<>();
        while(!q.isEmpty()){
            st.add(q.poll());
        }
        while(!st.isEmpty()){
            q.add(st.pop());
        }

        System.out.println(q);
    }
}
