package com.bridgelabz.collections.iostream.pipestream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PipedInputStream;

class ReaderThread extends Thread {
    private PipedInputStream inputStream;

    public ReaderThread(PipedInputStream inputStream) {
        this.inputStream = inputStream;
    }

    public void run() {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream))) {
            String receivedMessage = reader.readLine();
            System.out.println("ReaderThread received: " + receivedMessage);
        } catch (IOException e) {
            System.err.println("ReaderThread IOException: " + e.getMessage());
        }
    }
}
