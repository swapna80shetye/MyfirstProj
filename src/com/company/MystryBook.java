package com.company;

public class MystryBook extends NewBook {
   private String genre="Mystry";


    @Override
    public void printValues() {

        System.out.println("genre of this book is: "+genre);
    }
}
