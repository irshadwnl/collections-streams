package com.bridgelabz.collections.iostream.filehandling;

import java.io.*;

public class FileHandling {
    public static void main(String[] args) {
        String sourceFile = "src/com/bridgelabz/collections/iostream/filehandling/output.txt";

        String destFile = "destination.txt";

        try (

                FileInputStream fis = new FileInputStream(sourceFile);
                FileOutputStream fos = new FileOutputStream(destFile)) {

                File file = new File(sourceFile);
                if (!file.exists()) {
                System.out.println("Source file does not exist: " + sourceFile);
                return;
                }

                int byteData;
                while ((byteData = fis.read()) != -1) {
                fos.write(byteData);
                }

            System.out.println("File copied successfully from " + sourceFile + " to " + destFile);

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
