package com.bridgelabz.Array;

import java.util.Arrays;

public class SmallestElement {
    public static void main(String[] args) {

        int[] arr = {45, 20, 15, 40, 65};
        int min = arr[0];
        System.out.println("Array = "+Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < min)
                min = arr[i];
        }
        System.out.println("Smallest number in array = " + min);

    }
}


