package com.exceptoin.handling.unchecked;

public class DivideByZero {

    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        int result = a + b;
        try {
            //Unchecked / Runtime Exception -> Only caught during program execution

        } catch (ArithmeticException exception) {
            //exception.printStackTrace();
            System.out.println("Divide By Zero exception is handled! -> " + exception.getMessage());
        }
        System.out.println("*********************************\n");
        System.out.println("After the exception code ");

    }
}
