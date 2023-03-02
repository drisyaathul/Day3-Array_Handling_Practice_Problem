package com.bridgelabz.Array;

import java.util.Arrays;

public class SecondLargestNumber {
    public static void main(String[] args) {
        int arr[] = {50, 20, 35, 85, 90, 75};
        System.out.println("Array = "+ Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("Sorted Array = "+ Arrays.toString(arr));
        int count = arr.length;
        System.out.println("Second Largest Number = "+arr[count-2]);
    }
}
