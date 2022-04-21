package com.dsa.arrays;

public class ReverseNumbers {

    static int[] reverseArray(int arr[]) {

        int start = 0, end = arr.length - 1, temp;

        while (start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        printArrayElements(arr);

        return arr;
    }

    static void printArrayElements(int arr[]){
        System.out.print("\nArray Elements are :- ");
        //statement1 -> executed once -> initialization
        //statement2 -> conditional statement -> check the condition -> every single iteration
        //statement3 -> increment / decrement -> every single iteration
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" "+ arr[i]);
        }
        System.out.println();
    }


    public static void main(String[] args) {
        int arr[] = {4, 2, 1, 6, 8, 5};

        printArrayElements(arr);
        reverseArray(arr);


    }

}
