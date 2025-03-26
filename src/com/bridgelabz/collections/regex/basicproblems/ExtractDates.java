package com.bridgelabz.collections.regex.basicproblems;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractDates {
    public static void main(String[] args) {
        String text="The events are scheduled for 12/05/2023, 15/08/2024, and 29/02/2020.";
        Pattern p=Pattern.compile("\\b(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/\\d{4}\\b");
        Matcher m=p.matcher(text);

        while(m.find()){
            System.out.println(m.group());
        }

    }
}
