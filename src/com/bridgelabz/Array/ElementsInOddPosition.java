package com.bridgelabz.Array;

import java.util.Arrays;

public class ElementsInOddPosition {
    public static void main(String[] args) {
        int array[] = {9, 18, 2, 15, 22, 17, 3, 12};
        System.out.println("Array =" + Arrays.toString(array));
        System.out.println();
        for (int i = 1; i < array.length; i = i + 2) {
            System.out.println("Index = "+i);
            System.out.println("Odd Position of Elements = " + array[i]);
        }
    }
}
