package com.dsa.strings;

public class FindFirstNonRepeatingCharacter {


    static char findFirstNonRepeatingCharacter(String input) {
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            boolean isFound = false;
            for (int j = i + 1; j < input.length() - 1; j++) {
                if (input.charAt(i) == input.charAt(j)) {
                    isFound = true;
                }
            }
            if (!isFound) {
                return currentChar;
            }
        }
        return '0';
    }

    public static void main(String[] args) {
        System.out.println("Fist Non repeating character is : "+ findFirstNonRepeatingCharacter("raghavendra"));
    }
}
