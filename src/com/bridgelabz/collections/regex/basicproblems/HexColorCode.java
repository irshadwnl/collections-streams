package com.bridgelabz.collections.regex.basicproblems;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HexColorCode {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter hexcode");
        String hexCode=sc.next();
        Pattern p=Pattern.compile("^#[0-9A-F-a-f]{6}");
        Matcher m=p.matcher(hexCode);
        boolean ans=m.matches();
        if(ans){
            System.out.println("Valid HexCode: "+hexCode);
        }else {
            System.out.println("Invalid HexCode: "+hexCode);
        }
    }
}
