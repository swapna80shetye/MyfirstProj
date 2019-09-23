package com.company;

import java.util.Scanner;

public class DescendingOrder {

    public static void main(String[] args) {
        int[] a = new int[4];
        Scanner s = new Scanner(System.in);
        int k;
        for (k = 0; k < 4; k++) {
            a[k] = s.nextInt();
        }
        int temp;
        for (int i = 0; i < 4; i++) {
            for (int j = i + 1; j < 4; j++) {
                if (a[i] < a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
            System.out.print(a[i] + ",");
        }


    }


}



