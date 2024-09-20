package com.regexproblems;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class EmailRegex {

    public static boolean validateEmail(String email) {
        String regex = "^abc@bridgelabz.*$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
    public static void main(String[] args) {
        String email1 = "abc@bridgelabz.com";
        String email2 = "abc@xyz.com";
        String email3 = "abc@bridgelabz.co.in";
        String email4 = "xyz@bridgelabz.com";
        
        System.out.println(email1 + " is " + (validateEmail(email1) ? "valid" : "invalid") + " email.");
        System.out.println(email2 + " is " + (validateEmail(email2) ? "valid" : "invalid") + " email.");
        System.out.println(email3 + " is " + (validateEmail(email3) ? "valid" : "invalid") + " email.");
        System.out.println(email4 + " is " + (validateEmail(email4) ? "valid" : "invalid") + " email.");

    }
}
