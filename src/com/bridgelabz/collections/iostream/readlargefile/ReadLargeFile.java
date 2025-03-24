package com.bridgelabz.collections.iostream.readlargefile;

import java.io.*;

public class ReadLargeFile {
    public static void main(String[] args) {
        String filePath = "src/com/bridgelabz/collections/iostream/readlargefile/large_log.txt"; // Replace with the actual file path
        readErrorLines(filePath);
    }

    private static void readErrorLines(String filePath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.toLowerCase().contains("error")) {
                    System.out.println(line);
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }
}
