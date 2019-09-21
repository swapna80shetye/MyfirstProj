package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // NewBook b = new NewBook("swapna");
        //**** declare the array of the objects here******
        NewBook[] b = new NewBook[2];
        for (int i = 0; i < 2; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("enter the title: ");
            String titleInmain = scanner.nextLine();
            //*****initializing the each object here by calling the constructor on it************
            b[i] = new NewBook(titleInmain);
            b[i].printValues();

        }
        MystryBook c = new MystryBook();
        c.printValues();

    }
}