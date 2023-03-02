package com.bridgelabz.Array;

import java.util.Arrays;

public class DuplicateArray {
    public static void main(String[] args) {
        int[] arr = {15, 25, 35, 60, 40, 35, 40};
        System.out.println("Array = "+ Arrays.toString(arr));
        System.out.println();

        System.out.println("Duplicate elements in an array ");
        for(int i = 0; i < arr.length; i++){
            for (int j = i + 1; j < arr.length; j++){
                if  (arr[i] == arr[j]){
                    System.out.println("Duplicate of Elements in array is  " + arr[j]);
                }
            }
        }
    }
}
