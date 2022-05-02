package com.exceptoin.handling.unchecked;


public class NFException {

    public static void main(String[] args) {
        try {
            double parseDouble = Double.parseDouble("123");
            System.out.println("Parsed double : " + parseDouble);

            Integer abc = new Integer("  432 ");
            System.out.println("Parsed double : " + abc);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException thrown!" + e.getMessage());
        }
    }
}
