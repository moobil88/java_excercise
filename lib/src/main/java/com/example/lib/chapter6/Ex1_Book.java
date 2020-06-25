package com.example.lib.chapter6;

import java.util.Objects;

public class Ex1_Book {
    private String title;
    private String author;
    private String isbn;
    private int numPages;


    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getNumPages() {
        return numPages;
    }

    public String getIsbn() {
        return isbn;
    }

    //Setter
    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setNumPages(int numPages) {
        this.numPages = numPages;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Ex1_Book)) return false;
        Ex1_Book ex1_book = (Ex1_Book) o;
        return getNumPages() == ex1_book.getNumPages() &&
                getTitle().equals(ex1_book.getTitle()) &&
                getAuthor().equals(ex1_book.getAuthor()) &&
                getIsbn().equals(ex1_book.getIsbn());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTitle(), getAuthor(), getIsbn(), getNumPages());
    }

    @Override
    public String toString() {
        return "Ex1_Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", isbn='" + isbn + '\'' +
                ", numPages=" + numPages +
                '}';
    }
}
