package com.bridgelabz.Array;

public class AscendingOrder {
    public static void main(String[] args) {
        int[] arr = {10, 8, 6, 12, 9};
        int temp = 0;

        System.out.println("Elements of orignal array ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println();

        System.out.println("Displaying Elements in Ascending order");
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
