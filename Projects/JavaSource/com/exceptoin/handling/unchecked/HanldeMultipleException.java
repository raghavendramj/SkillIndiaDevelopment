package com.exceptoin.handling.unchecked;

import java.io.FileReader;

public class HanldeMultipleException {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("myFile2.txt"); // Raises FileNotFoundException
            System.out.println("Block 1");
            HanldeMultipleException object = new HanldeMultipleException();

            Object test = 10;
            int val = (int) test / 0; //DivideByZero -> ArithmeticException
            System.out.println("Block 2");
            int a = 20;
            int b = 30;
            int result = (int) object.addition(a, b); // Raises NullPointerException
            System.out.println("Block 3" + result);
            // } catch (NullPointerException | ArithmeticException ex) {
            // } catch (RuntimeException ex) {
            // } catch (RuntimeException | FileNotFoundException ex ) {
        } catch (Exception ex) {
            System.out.println("Block 4 -> Catch Block -> " + ex.getMessage());
        } finally {
            System.out.println("After any exception or non case i will execute");
        }
        System.out.println("Block 5 -> Outside try catch");
    }

    Object addition(int a, int b) {
        Object result = a + b;
        result = null;
        return result;
    }
}


