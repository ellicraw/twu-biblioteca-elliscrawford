package com.twu.biblioteca;

import java.time.LocalDate;

public class Book {
    private String title;
    private LocalDate date;
    private String author;
    private int yearOfPublication;

    public Book(String title, String author, int yearOfPublication) {
        this.title = title;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() { return this.author; }

    public int getYearOfPublication() { return this.yearOfPublication; }

}