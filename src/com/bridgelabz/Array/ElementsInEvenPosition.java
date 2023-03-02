package com.bridgelabz.Array;

import java.util.Arrays;

public class ElementsInEvenPosition {
    public static void main(String[] args) {
      int array[] = {1, 8, 10, 4, 7, 6, 9};
        System.out.println("Array = " + Arrays.toString(array));
        System.out.println();
        for (int i = 2; i < array.length; i=i+2) {
            System.out.println("Index = "+i);
            System.out.println("Even Position of Elements :"+array[i]);
        }
    }

}
