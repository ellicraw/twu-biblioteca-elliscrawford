package com.twu.biblioteca;

import java.time.LocalDate;

public class Book {
    private String title;
    private LocalDate Date;

    public Book(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

}