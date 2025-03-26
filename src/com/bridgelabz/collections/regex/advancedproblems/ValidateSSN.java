package com.bridgelabz.collections.regex.advancedproblems;
import java.util.Scanner;
import java.util.regex.*;
public class ValidateSSN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter SSN:");
        String ssn = sc.next();

        // SSN regex pattern (XXX-XX-XXXX)
        String regex = "^\\d{3}-\\d{2}-\\d{4}$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(ssn);

        if (matcher.matches()) {
            System.out.println(ssn + "\" is a valid SSN.");
        } else {
            System.out.println(ssn + "\" is an invalid SSN.");
        }

    }
}
