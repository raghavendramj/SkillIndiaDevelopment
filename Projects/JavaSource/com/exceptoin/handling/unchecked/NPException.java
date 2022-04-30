package com.exceptoin.handling.unchecked;

public class NPException {

    public static void main(String[] args) {
        try {
            NPException object = new NPException();

            int a = 20;
            int b = 30;
            int result = (int) object.addition(a, b);
            int divideResult = result / 5;
            System.out.println("Final result : " + divideResult);



        } catch (NullPointerException e) {
            System.out.println("This is result of NULL pointer exception!");
        }

        System.out.println("This is baad wala code ");

    }

    Object addition(int a, int b) {
        return null;
    }
}
