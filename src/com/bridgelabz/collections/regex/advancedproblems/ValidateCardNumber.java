package com.bridgelabz.collections.regex.advancedproblems;
import java.util.*;
import java.util.regex.*;
public class ValidateCardNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Credit Card Number:");
        String cardNumber = sc.next();

        // Regex for Visa (4xxxxxxxxxxxxxxx) & MasterCard (5xxxxxxxxxxxxxxx)
        String regex = "^(4\\d{15}|5\\d{15})$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(cardNumber);

        if (matcher.matches()) {
            System.out.println(cardNumber + " is a VALID Credit Card number.");
        } else {
            System.out.println(cardNumber + " is an INVALID Credit Card number.");
        }
    }
}
