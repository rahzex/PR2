//1. Write a Java method to Reverse the given input & Check if it is a Palindrome.
//
package com.stackroute.practice;


public class PalindromeCheck {
    public Boolean palindrome(String userInput) {
        String reversedInput = new StringBuffer(userInput).reverse().toString();
        if (userInput.equals(reversedInput))
            return true;
        else
            return false;
    }
}
