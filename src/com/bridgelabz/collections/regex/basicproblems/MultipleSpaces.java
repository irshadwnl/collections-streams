package com.bridgelabz.collections.regex.basicproblems;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MultipleSpaces {
    public static void main(String[] args) {
        String text="This is an   example   with   multiple spaces.";
        Pattern p=Pattern.compile("\\s+");
        Matcher m=p.matcher(text);
        System.out.println(m.replaceAll(" "));

    }
}
