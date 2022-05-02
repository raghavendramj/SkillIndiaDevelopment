package com.exceptoin.handling;

public class FinallyWithoutCatch {

    public static void main(String[] args) {

        try {
            System.out.println("This is main");
        }

        finally {
            System.out.println("This is finally!");
        }
    }
}
