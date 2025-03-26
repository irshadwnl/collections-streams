package com.bridgelabz.collections.regex.advancedproblems;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateIP {
    public static void main(String[] args) {
        String[] testIPs = {
                "192.168.1.1",
                "255.255.255.255",
                "256.100.50.25",
                "192.168.01.1",
                "1.1.1",
                "192.168.1.abc"
        };
        String regex = "\\b(25[0-5]|2[0-4][0-9]|1[0-9]{2}|[1-9][0-9]?|0)\\."
                + "(25[0-5]|2[0-4][0-9]|1[0-9]{2}|[1-9][0-9]?|0)\\."
                + "(25[0-5]|2[0-4][0-9]|1[0-9]{2}|[1-9][0-9]?|0)\\."
                + "(25[0-5]|2[0-4][0-9]|1[0-9]{2}|[1-9][0-9]?|0)\\b";
        Pattern p=Pattern.compile(regex);
        for(String ip:testIPs){
            Matcher m=p.matcher(ip);
            boolean ans=m.matches();
            if(ans){
                System.out.println("Valid Ip Address: "+ip);
            }else {
                System.out.println("Invalid IP Address: "+ip);
            }
        }
    }
}
