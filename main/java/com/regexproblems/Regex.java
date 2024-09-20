package com.regexproblems;
import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;



public class Regex {

    public static boolean validatePinCode(String pinCode) {
        String regex = "^[1-9][0-9]{5}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(pinCode);
        return matcher.matches();
    }

    public static void main(String[] args) {
        String[] pinCodes = {"400088", "A400088", "40088", "500100", "B123456"};


        for (String pinCode : pinCodes) {
            if (validatePinCode(pinCode)) {
                System.out.println(pinCode + " is a valid PIN code.");
            } else {
                System.out.println(pinCode + " is not a valid PIN code.");
            }
        }
    }

}

