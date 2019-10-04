package com.twu.biblioteca;

import java.util.*;

public class Library {

    HashSet<Book> library = new HashSet<Book>();

    public HashSet<Book> createLibrary(){
        library.add(new Book("Animal Farm"));
        library.add(new Book("Educated"));
        library.add(new Book("The Catcher in the Rye"));
        library.add(new Book("Lolita"));
        library.add(new Book("Maus"));
        library.add(new Book("The Phantom Tollbooth"));
        library.add(new Book("Born a Crim"));
        library.add(new Book("Slaughterhouse-Five"));

        return library;
    }
}
