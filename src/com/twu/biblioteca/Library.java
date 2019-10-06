package com.twu.biblioteca;

import java.util.*;

public class Library {

    private ArrayList<Book> books;
    private ArrayList<Book> checkedOutBooks = new ArrayList<Book>();

    public Library() {
        this.books = new ArrayList<Book>();
    }

//    public ArrayList<Book> createLibrary(){
//        library.add(new Book("Animal Farm", "George Orwell", 1945));
//        library.add(new Book("Educated", "Tara Westover", 2018));
//        library.add(new Book("The Catcher in the Rye","J. D. Salinger", 1951));
//        return library;
//    }

    public void addBooks(Book... libraryItemsToAdd) {
        for(Book item : libraryItemsToAdd){
            books.add(item);
        }

    }

    public void printLibrary() {
        System.out.println("Title" + " | " + "Author" + " | " + "Publication Year");
        System.out.println("---------------------------------");

        for (Book l : books) {
            System.out.println(l.getTitle() + " | " + l.getAuthor() + " | " + l.getYearOfPublication());
        }
    }

    public void checkOut() {
        String checkoutTitle = getTitle();
        removeBook(checkoutTitle);
        System.out.println("Thank you! Enjoy your book!");
    }

    private void removeBook(String title) {
        for (Book b : new ArrayList<Book>(books)) {
            if(b.getTitle().equals(title)) {
                books.remove(b);
                checkedOutBooks.add(b);
            }
        }
    }
    private String getTitle() {
        System.out.println("Please enter the title of the book you would like to checkout: ");
        Scanner scan = new Scanner(System.in);
        String title = scan.nextLine();
        return title;
    }

    private boolean isTitleValid(String title) {
        return true;
    }

}
