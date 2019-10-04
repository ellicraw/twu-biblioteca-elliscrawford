package com.twu.biblioteca;

import java.util.*;

public class Library {

    ArrayList<Book> library = new ArrayList<Book>();

    public ArrayList<Book> createLibrary(){
        library.add(new Book("Animal Farm", "George Orwell", 1945));
        library.add(new Book("Educated", "Tara Westover", 2018));
        library.add(new Book("The Catcher in the Rye","J. D. Salinger", 1951));
        return library;
    }

    public void printLibrary () {
        System.out.println("Title" + " | " + "Author" + " | " + "Publication Year");
        System.out.println("---------------------------------");

        for (Book l : library) {
            System.out.println(l.getTitle() + " | " + l.getAuthor() + " | " + l.getYearOfPublication());
        }
    }

}
