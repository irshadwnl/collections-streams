package com.bridgelabz.collections.collectionss.queue;

import java.util.Arrays;

class CircularBuffer {
    private int[] buffer;
    private int size, front, rear, count;

    public CircularBuffer(int size) {
        this.size = size;
        this.buffer = new int[size];
        this.front = 0;
        this.rear = -1;
        this.count = 0;
    }

    public void insert(int val) {
        rear = (rear + 1) % size; // Move rear circularly
        buffer[rear] = val;

        if (count < size) {
            count++; // Increase count until full
        } else {
            front = (front + 1) % size; // Overwrite the oldest element
        }

        System.out.println("Inserted: " + val);
    }

    public void display() {
        if (count == 0) {
            System.out.println("Buffer is empty");
            return;
        }

        System.out.print("Buffer: ");
        for (int i = 0; i < count; i++) {
            System.out.print(buffer[(front + i) % size] + " ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        CircularBuffer cb = new CircularBuffer(3);

        cb.insert(1);
        cb.insert(2);
        cb.insert(3);
        cb.display();  // Output: Buffer: 1 2 3

        cb.insert(4);  // Overwrites 1
        cb.display();  // Output: Buffer: 2 3 4

        cb.insert(5);  // Overwrites 2
        cb.display();  // Output: Buffer: 3 4 5
    }
}
