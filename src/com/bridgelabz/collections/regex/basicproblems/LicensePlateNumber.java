package com.bridgelabz.collections.regex.basicproblems;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LicensePlateNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String ln=sc.next();
        Pattern p=Pattern.compile("^[A-Z]{2}[0-9]{4}");
        Matcher m=p.matcher(ln);
        boolean ans=m.matches();
        if(ans){
            System.out.println("Valid License Number: "+ln);
        }else{
            System.out.println("Invalid License Number: "+ln);
        }
    }
}
