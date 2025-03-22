package com.bridgelabz.collections.collectionss.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


public class ImplementStackUsingQueue {
    Queue<Integer> q;
    Queue<Integer> q2;

    ImplementStackUsingQueue(){
        q=new LinkedList<>();
        q2=new LinkedList<>();
    }
     private void push(int val){
        q.add(val);
         System.out.println("Added value: "+val);
    }

    private void pop(){
        if(q.isEmpty()){
            System.out.println("Cannot Pop Stack is Empty");
            return;
        }else{
            while(q.size()>1){
                q2.add(q.poll());
            }
        }
        System.out.println("Removed element: "+q.poll());
        Queue<Integer> temp = q;
        q = q2;
        q2 = temp;
    }

    private void top() {
        if (q.isEmpty()) {
            System.out.println("Stack is Empty");
            return;
        }

        // Move all elements except the last one to q2
        while (q.size() > 1) {
            q2.add(q.poll());
        }

        // Peek at the last element (top of stack)
        int topElement = q.peek();
        System.out.println("Top element: " + topElement);

        // Move it to q2 as well
        q2.add(q.poll());

        // Swap queues
        Queue<Integer> temp = q;
        q = q2;
        q2 = temp;
    }


    public static void main(String[] args) {
        ImplementStackUsingQueue ip=new ImplementStackUsingQueue();
        ip.push(5);
        ip.push(10);
        ip.top();
        ip.pop();
        ip.push(15);
        ip.push(20);
        ip.push(25);
        ip.pop();
        ip.top();
    }


}
