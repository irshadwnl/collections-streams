package com.bridgelabz.collections.regex.advancedproblems;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractProgrammingLanguage {
    public static void main(String[] args) {
        String text="I love Java, Python, and JavaScript, but I haven't tried Go yet.";
        Pattern p=Pattern.compile( "\\b(JavaScript|Java|Python|Go|C\\+\\+|C#|Ruby|Swift|Kotlin|PHP|Rust|TypeScript|Perl)\\b");
        Matcher m=p.matcher(text);
        while(m.find()){
            System.out.println(m.group());
        }

    }
}
