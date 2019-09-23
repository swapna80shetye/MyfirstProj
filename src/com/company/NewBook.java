package com.company;

import sun.rmi.runtime.NewThreadAction;

public class NewBook {


    public String title;

    public NewBook() {
        System.out.println("default constructor without any parameters!!");
        setTitle("here:::");
        printValues();
    }


        public NewBook(String title) {
            setTitle(title);
        }

    private void setTitle(String title) {
        if (title.equals("")) {
            throw new IllegalArgumentException("title cannot be empty!!!");
        }
        this.title = title;

    }

    private String getTitle() {
        return this.title;
    }

    public void printValues() {
        System.out.println(getTitle());
    }

}
