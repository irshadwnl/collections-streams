package com.bridgelabz.collections.regex.advancedproblems;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindRepeatedWords {
    public static void main(String[] args) {
        String text="This is is a repeated Repeated word test.";

        Pattern p=Pattern.compile("\\b(\\w+)\\s+\\1\\b",Pattern.CASE_INSENSITIVE);
        Matcher m=p.matcher(text);
        while (m.find()){
            System.out.println(m.group());
        }
    }
}
