package com.chandramouli.javaprogramsolving.palindrome1;

import java.util.Scanner;

public class Palindrome1 {

    public static void main(String[] args){

        System.out.print("Enter the String: ");
        Scanner input = new Scanner(System.in);
        String palindrome = input.nextLine();
        input.close();

        int len = palindrome.length();

        char[] temp = new char[len];
        char[] reverse = new char[len];

        for (int i=0; i<len; i++){
            temp[i] = palindrome.charAt(i);
        }

        for (int i=0; i<len; i++){
            reverse[i] = temp[(len-1) - i];
        }

        String reversePalindrome = new String(reverse);
        System.out.println("String: " + palindrome + ", Reverse: " + reversePalindrome);
        if(palindrome.equals(reversePalindrome)) System.out.println("It is Palindrome!");
        else System.out.println("It is not a Palindrome!");
    }
}
