package com.regexproblems;
import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;



public class Regex {

    // Method to validate PIN code using regex
    public static boolean validatePinCode(String pinCode) {
        // Define the regex pattern for a valid 6-digit Indian PIN code
        String regex = "^[1-9][0-9]{5}$";

        // Compile the regex pattern
        Pattern pattern = Pattern.compile(regex);

        // Match the input PIN code against the pattern
        Matcher matcher = pattern.matcher(pinCode);

        // Return true if the input matches the pattern
        return matcher.matches();
    }

    public static void main(String[] args) {
        System.out.println("Welcome to regex problem");
        String pinCode = "400088";

        // Validate the PIN code
        if (validatePinCode(pinCode)) {
            System.out.println(pinCode + " is a valid PIN code.");
        } else {
            System.out.println(pinCode + " is not a valid PIN code.");
        }

    }
}
