package com.regexproblems;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class EmailRegex {


    public static boolean validateEmail(String email) {

        String regex = "^abc([._+\\-][a-zA-Z0-9]+)?@bridgelabz\\.co(\\.[a-z]{2,})?$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }


    public static void main(String[] args) {
        String email1 = "abc@bridgelabz.co";
        String email2 = "abc.xyz@bridgelabz.co.in";
        String email3 = "abc+xyz@bridgelabz.co";
        String email4 = "abc_xyz@bridgelabz.co";
        String email5 = "abc-xyz@bridgelabz.co.in";
        String email6 = "abc@xyz.co";  // Invalid

        
        System.out.println(email1 + " is " + (validateEmail(email1) ? "valid" : "invalid") + " email.");
        System.out.println(email2 + " is " + (validateEmail(email2) ? "valid" : "invalid") + " email.");
        System.out.println(email3 + " is " + (validateEmail(email3) ? "valid" : "invalid") + " email.");
        System.out.println(email4 + " is " + (validateEmail(email4) ? "valid" : "invalid") + " email.");
        System.out.println(email5 + " is " + (validateEmail(email5) ? "valid" : "invalid") + " email.");
        System.out.println(email6 + " is " + (validateEmail(email6) ? "valid" : "invalid") + " email.");
    }
}

