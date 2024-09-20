package com.regexproblems;
import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;



public class Regex {

    public static boolean validatePinCode(String pinCode) {
        String regex = "^[1-9][0-9]{2}\\s?[0-9]{3}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(pinCode);
        return matcher.matches();
    }

    public static void main(String[] args) {
        String pinCode1 = "400088";
        String pinCode2 = "400 088";

        // Validate the PIN codes
        System.out.println(pinCode1 + " is " + (validatePinCode(pinCode1) ? "valid" : "invalid") + " PIN code.");
        System.out.println(pinCode2 + " is " + (validatePinCode(pinCode2) ? "valid" : "invalid") + " PIN code.");
    }

}

