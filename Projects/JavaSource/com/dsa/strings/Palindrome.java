package com.dsa.strings;

public class Palindrome {


    static boolean isPalindromeApproach1(String input) {
        String temp = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            temp += input.charAt(i);
        }
        System.out.println("Input : " + input);
        System.out.println("Temp : " + temp);
        if (temp.equals(input)) {
            return true;
        }
        return false;
    }


    static boolean isPalindromeApproach2(String input) {

        int i = 0;
        int j = input.length() - 1;
        while (i < j) {
            if (input.charAt(i) != input.charAt(j))
                return false;

            i++;
            j--;
        }
        return true;
    }


    public static void main(String[] args) {
        System.out.println("Is madam a palindrome ? " + isPalindromeApproach2("madam"));
        System.out.println("Is madam a palindrome ? " + isPalindromeApproach2("raghav"));
        System.out.println("Is madam a palindrome ? " + isPalindromeApproach2("gadag"));

    }
}
