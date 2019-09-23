package com.company;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        int[] numbers=new int[4];
        Scanner s=new Scanner(System.in);
        for (int i = 0; i <4 ; i++) {
            System.out.println("enter the array element:");
            numbers[i]=s.nextInt();
                    }
        int largest=0;
        for (int i = 0; i <4 ; i++) {
            if (largest<numbers[i]){
                largest=numbers[i];

            }
        }
        System.out.println("the largest number is: "+largest);
    }

}
