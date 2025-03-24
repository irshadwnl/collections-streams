package com.bridgelabz.collections.iostream.pipestream;

import java.io.IOException;
import java.io.PipedOutputStream;

class WriterThread extends Thread {
    private PipedOutputStream outputStream;

    public WriterThread(PipedOutputStream outputStream) {
        this.outputStream = outputStream;
    }

    public void run() {
        try {
            String message = "Hello from WriterThread!";
            outputStream.write(message.getBytes());
            outputStream.close();
        } catch (IOException e) {
            System.err.println("WriterThread IOException: " + e.getMessage());
        }
    }
}

