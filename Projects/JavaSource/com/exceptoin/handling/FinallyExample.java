package com.exceptoin.handling;

public class FinallyExample {

    public static void main(String[] args) {
        try {
            int arr[] = new int[5];
            arr[0] = 1;
            arr[1] = 2;
            arr[2] = 3;
            arr[3] = 4;
            arr[4] = 5;
            System.out.println("Array[4] : " + arr[8]);

            //Close

        } catch (Exception e) {
            System.out.println("Exception Occured "+ e.getMessage());
        }
        finally {
            //will execute no matter what we get exception or not.
            System.out.println("This is finally block");
        }

    }
}
