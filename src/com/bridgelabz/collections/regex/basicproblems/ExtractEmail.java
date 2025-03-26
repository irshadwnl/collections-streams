package com.bridgelabz.collections.regex.basicproblems;

import java.util.regex.*;

public class ExtractEmail {
    public static void main(String[] args) {
        String text = "Contact us at support@example.com and info@company.org for more info.";
        Pattern p = Pattern.compile("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}");
        Matcher m=p.matcher(text);
        while(m.find()){
            System.out.println(m.group());
        }
    }
}
