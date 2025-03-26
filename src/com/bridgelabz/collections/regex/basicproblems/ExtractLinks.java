package com.bridgelabz.collections.regex.basicproblems;
import java.util.regex.*;
public class ExtractLinks {
    public static void main(String[] args) {
        String text="Visit https://www.google.com and http://example.org for more info.";
        String regex = "\\bhttps?://[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        System.out.println("Extracted URLs:");
        while (matcher.find()) {
            System.out.println(matcher.group()); // Print each matched URL
        }
    }
}
