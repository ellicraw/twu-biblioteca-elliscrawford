package com.twu.biblioteca;

public class Movie {
    private String title;
    private int year;
    private String director;
    private int rating;

    public Movie(String title, int year, String director, int rating){
        this.title = title;
        this.year = year;
        this.director = director;
        this.rating = rating;
    }

    public String getTitle() {
        return this.title;
    }

    public String getDirector() {
        return this.director;
    }

    public int getYearOfPublication() {
        return this.year;
    }

    public int getRating() {
        return this.rating;
    }
}
