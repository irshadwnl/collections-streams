package com.bridgelabz.collections.regex.advancedproblems;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractCurrency {
    public static void main(String[] args) {
        // example
        String text="The price is $45.99, and the discount is 10.50.";
        Pattern  p=Pattern.compile("\\$?\\d+(\\.\\d{2})?");
        Matcher m= p.matcher(text);
        while (m.find()){
            System.out.println(m.group());
        }
    }
}
