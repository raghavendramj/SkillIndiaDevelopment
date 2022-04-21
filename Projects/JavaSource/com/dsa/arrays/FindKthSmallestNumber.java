package com.dsa.arrays;

public class FindKthSmallestNumber {
    static int findKthSmallestNumber(int arr[], int k) {
        sortNumbers(arr);
        printArrayElements(arr);
        return arr[k-1];
    }
    private static void sortNumbers(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    static void printArrayElements(int arr[]){
        System.out.print("\nArray Elements are :- ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" "+ arr[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {7, 10, 4, 3, 20, 15};
        printArrayElements(arr);
        int kthsmallest = findKthSmallestNumber(arr, 2);
        System.out.println("Kth Smallest element is :- "+ kthsmallest);
    }
}
