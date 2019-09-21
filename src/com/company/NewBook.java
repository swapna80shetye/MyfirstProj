package com.company;

public class NewBook {


    private String title;

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
