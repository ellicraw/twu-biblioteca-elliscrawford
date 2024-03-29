package com.twu.biblioteca;

import java.util.*;

public class Library {

    private ArrayList<Book> books;
    private ArrayList<Movie> movies;
    private ArrayList<Book> checkedOutBooks = new ArrayList<Book>();
    private UserAccount user;

    public Library(UserAccount user) {
        this.books = new ArrayList<Book>();
        this.movies = new ArrayList<Movie>();
        this.user = user;
        
    }

    public void addBooks(Book... libraryItemsToAdd) {
        for(Book item : libraryItemsToAdd){
            books.add(item);
        }

    }

    public void addMovies(Movie... libraryItemsToAdd) {
        for (Movie item: libraryItemsToAdd) {
            movies.add(item);
        }
    }

    public void printBooks() {
        System.out.println("Title" + " | " + "Author" + " | " + "Publication Year");
        System.out.println("---------------------------------");

        for (Book b : books) {
            System.out.println(b.getTitle() + " | " + b.getAuthor() + " | " + b.getYearOfPublication());
        }
    }

    public void printMovies() {
        System.out.println("Title" + " | " + "Director" + " | " + "Year" + " | " + "Rating");
        System.out.println("---------------------------------------------");

        for (Movie m : movies) {
            System.out.println(m.getTitle() + " | " + m.getDirector() + " | " + m.getYearOfPublication() + " | " + m.getRating());
        }
    }

    public void checkOut() {
        String checkoutTitle = getTitle();
        if(isValidCheckOut(checkoutTitle)) {
            removeBook(checkoutTitle);
            System.out.println("Thank you! Enjoy your book!");
        }
        else {
            System.out.println("Sorry, that book is unavailable. Try again");
            checkOut();
        }
    }

    public void checkIn() {
        String checkInTitle = getTitle();
        if(isValidCheckIn(checkInTitle)) {
            addBook(checkInTitle);
            System.out.println("Thank you for returning the book");
        }
        else {
            System.out.println("That is not a valid book to return");
        }
    }

    public void displayUserInfo(){
        System.out.println("Username : " + user.getUserName());
        System.out.println("User email: " + user.getUserEmail());
        System.out.println("User phone number: " + user.getUserPhoneNum());

    }

    private void removeBook(String title) {
        for (Book b : new ArrayList<Book>(books)) {
            if(b.getTitle().equals(title)) {
                books.remove(b);
                checkedOutBooks.add(b);
            }
        }
    }

    private  void addBook(String title) {
        for (Book b : new ArrayList<Book>(checkedOutBooks)) {
            if(b.getTitle().equals(title)) {
                books.add(b);
                checkedOutBooks.remove(b);
            }
        }
    }

    private String getTitle() {
        System.out.println("Please enter the title of the book you would like to checkout: ");
        Scanner scan = new Scanner(System.in);
        String title = scan.nextLine();
        return title;
    }

    private boolean isValidCheckOut(String title){
        return books.stream().anyMatch(book -> book.getTitle().equals(title));
    }

    private boolean isValidCheckIn(String title) {
        return checkedOutBooks.stream().anyMatch(book -> book.getTitle().equals(title));
    }

}
