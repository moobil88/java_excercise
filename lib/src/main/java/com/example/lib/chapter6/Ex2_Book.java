package com.example.lib.chapter6;

import java.util.Objects;

public class Ex2_Book {
    private String title;
    private String author;
    private String isbn;
    private int numPages;

    public Ex2_Book(String title, String author, String isbn, int numPages) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.numPages = numPages;
    }

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
        if (!(o instanceof Ex2_Book)) return false;
        Ex2_Book ex2_book = (Ex2_Book) o;
        return getNumPages() == ex2_book.getNumPages() &&
                getTitle().equals(ex2_book.getTitle()) &&
                getAuthor().equals(ex2_book.getAuthor()) &&
                getIsbn().equals(ex2_book.getIsbn());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTitle(), getAuthor(), getIsbn(), getNumPages());
    }

    @Override
    public String toString() {
        return "Ex2_Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", isbn='" + isbn + '\'' +
                ", numPages=" + numPages +
                '}';
    }
}