package com.bridgelabz.Array;

import java.util.Arrays;

public class ReverseOrder {
    public static void main(String[] args) {

        int array[] = new int[] {1, 2, 3, 4, 5, 6};
        System.out.println("Array :" + Arrays.toString(array));
        System.out.println("Reverse Array :");
        for (int i=array.length-1; i>=0;i--) {
            System.out.println(array[i]+"");
        }
    }
}
