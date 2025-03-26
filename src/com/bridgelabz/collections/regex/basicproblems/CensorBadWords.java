package com.bridgelabz.collections.regex.basicproblems;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CensorBadWords {
    public static void main(String[] args) {
        String text="This is a damn bad example with some stupid words.";
        String[] badWords = {"damn", "stupid"};
        Pattern p=Pattern.compile("\\b(" + String.join("|", badWords) + ")\\b",Pattern.CASE_INSENSITIVE);
        Matcher m=p.matcher(text);
        String ans=m.replaceAll("****");
        System.out.println(ans);

    }
}
