package com.exceptoin.handling;

import java.math.BigDecimal;

public class IntroToExceptionHandlng {
    public static void main(String[] args) {
        int a;
        int b;
        a = 10;
        b = 20;
        int c;
        c = a + b;
        int d;
        d = c / 0; //This line throws an exception!
        System.out.println("Output : -" + d);
    }
}
