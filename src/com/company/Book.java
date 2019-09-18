package com.company;

public class Book {
    private String title;
    private String author;
    private int price;
    private int pages;

    public Book(String title, String author, int price) {
        setAuthor(author);
        setPrice(price);
        setTitle(title);

    }

    private void setAuthor(String author) {
        if (author == "") {
            throw new IllegalArgumentException("title cannot be empty!!!");
        }
        this.author = author;
    }

    private void setPrice(int price) {
        if (price < 0) {
            throw new IllegalArgumentException("invalid price!!!");
        }

        this.price = price;
    }

    private void setTitle(String title) {
        if (title == "") {
            throw new IllegalArgumentException("title cannot be empty!!!");
        }
        this.title = title;
    }

    public void print() {
        System.out.println("the book " + title + "is written by " + author + "and the price is only," + price);
    }
}
