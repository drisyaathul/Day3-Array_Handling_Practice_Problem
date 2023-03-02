package com.bridgelabz.Array;

import java.util.Arrays;

public class LargestElement {
    public static void main(String[] args) {

        int array[] = {10, 20, 45, 30, 80, 60, 90, 55};
        System.out.println("Array = "+Arrays.toString(array));
        Arrays.sort(array);
        System.out.println("Sorted Array = "+Arrays.toString(array));
        int count = array.length;
        System.out.println("The Largest Element in an Array = "+array[count-1]);
    }

}



