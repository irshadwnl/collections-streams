package com.bridgelabz.collections.collectionss.queue;

import java.util.*;

class Patient implements Comparable<Patient>{
    String name;
    int priority;

    public Patient(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }
    @Override
    public int compareTo(Patient other) {
        return Integer.compare(other.priority, this.priority); // Descending order
    }
}
public class HospitalTriageSystem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Queue<Patient> q=new LinkedList<>();
        for(int i=0;i<n;i++){
            String nam=sc.next();
            int prio=sc.nextInt();
            q.add(new Patient(nam,prio));
        }

        PriorityQueue<Patient> pq= new PriorityQueue<>();

        while(!q.isEmpty()){
            pq.add(q.poll());
        }

        while (!pq.isEmpty()){
            Patient p=pq.poll();
            System.out.println("Name: "+p.name+" Priority: "+p.priority);
        }
    }
}
