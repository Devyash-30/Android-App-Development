package com.company;

public class string_reversestring {

    public static void main(String[] args) {
        String string = "This is the String.";
        //Stores the reverse of given string
        String reversedStr = "";

        //Iterate through the string from last and add each character to variable reversedStr
        for(int i = string.length()-1; i >= 0; i--){
            reversedStr = reversedStr + string.charAt(i);
        }

        System.out.println("Original string: " + string);
        //Displays the reverse of given string
        System.out.println("Reverse of given string: " + reversedStr);
    }
}
