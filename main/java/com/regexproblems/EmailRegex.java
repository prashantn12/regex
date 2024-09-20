package com.regexproblems;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class EmailRegex {
    public static boolean validateEmail(String email) {
        String regex = "^abc@.*$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
    public static void main(String[] args) {
        String email1 = "abc@domain.com";
        String email2 = "xyz@domain.com";
        
        System.out.println(email1 + " is " + (validateEmail(email1) ? "valid" : "invalid") + " email.");
        System.out.println(email2 + " is " + (validateEmail(email2) ? "valid" : "invalid") + " email.");

    }
}
