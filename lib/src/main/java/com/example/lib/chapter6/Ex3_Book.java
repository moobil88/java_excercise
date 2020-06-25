package com.example.lib.chapter6;

import java.util.Objects;

public class Ex3_Book {

    private String title;
    private Ex3_User author;
    private String isbn;
    private int numPages;

    public Ex3_Book(String title, Ex3_User author, String isbn, int numPages) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.numPages = numPages;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Ex3_User getAuthor() {
        return author;
    }

    public void setAuthor(Ex3_User author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getNumPages() {
        return numPages;
    }

    public void setNumPages(int numPages) {
        this.numPages = numPages;
    }

    public void readBook(Ex3_Book book)
    {
        System.out.println(book.getTitle());

    }


    @Override
    public String toString() {
        return "Ex3_Book{" +
                "title='" + title + '\'' +
                ", author=" + author +
                ", isbn='" + isbn + '\'' +
                ", numPages=" + numPages +
                '}';
    }




}
