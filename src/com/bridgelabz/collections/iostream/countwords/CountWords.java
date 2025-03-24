package com.bridgelabz.collections.iostream.countwords;

import java.io.*;
import java.util.*;

public class CountWords {
    public static void main(String[] args) {
        String filePath = "src/com/bridgelabz/collections/iostream/countwords/sample.txt"; // Replace with actual file path
        countWords(filePath);
    }

    private static void countWords(String filePath) {
        Map<String, Integer> wordCountMap = new HashMap<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.toLowerCase().replaceAll("[^a-zA-Z ]", "").split("\\s+");
                for (String word : words) {
                    if (!word.isEmpty()) {
                        wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
                    }
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
            return;
        }

        List<Map.Entry<String, Integer>> sortedWords = new ArrayList<>(wordCountMap.entrySet());
        sortedWords.sort((a, b) -> b.getValue().compareTo(a.getValue()));

        System.out.println("Total Words: " + wordCountMap.size());
        System.out.println("Top 5 Most Frequent Words:");
        for (int i = 0; i < Math.min(5, sortedWords.size()); i++) {
            System.out.println(sortedWords.get(i).getKey() + " - " + sortedWords.get(i).getValue());
        }
    }
}
