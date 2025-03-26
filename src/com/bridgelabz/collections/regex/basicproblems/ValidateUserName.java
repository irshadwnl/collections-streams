package com.bridgelabz.collections.regex.basicproblems;

import java.util.Scanner;
import java.util.regex.*;

public class ValidateUserName {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Username:");
        String user=sc.next();
        Pattern p= Pattern.compile("^[a-zA-Z][a-zA-Z0-9_]{5,15}$");
        Matcher m= p.matcher(user);
        boolean ans=m.matches();
        if(ans){
            System.out.println("Valid Username: "+user);
        }else{
            System.out.println("Not Valid UserName: "+user);
        }

    }
}
