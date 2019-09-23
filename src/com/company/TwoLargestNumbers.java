package com.company;

import java.util.Scanner;

public class TwoLargestNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int size = scanner.nextInt();
        int[] values = new int[size];
        System.out.println("array size is :" + size);
        //entre the array elements
        for (int i = 0; i < size; i++) {
            values[i] = scanner.nextInt();
        }
        int largest1 = values[0];
        int largest2 = values[1];
        int temp;
        if (largest1 < largest2) {
            temp = largest1;
            largest1 = largest2;
            largest2 = temp;
        }

        for (int i = 2; i < size; i++) {
            if (values[i] > largest1) {
                largest2 = largest1;
                largest1 = values[i];
            } else if (values[i] > largest2 && values[i] != largest1) {
                largest2 = values[i];
            }
        }
        System.out.println("first largest number: " + largest1);
        System.out.println("second largest number: " + largest2);

    }
}
