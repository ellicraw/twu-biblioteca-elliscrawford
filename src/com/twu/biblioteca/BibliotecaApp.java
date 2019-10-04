package com.twu.biblioteca;
import java.time.LocalDate;
import java.util.*;
import java.lang.*;

public class BibliotecaApp {

    public static void main(String[] args) {
        System.out.println("Welcome to Biblioteca. Your one-stop-shop got great book titles in Bangalore!");

        Library lib = new Library();
        HashSet<Book> library = lib.createLibrary();
        for (Book l : library) {
            System.out.println(l.getTitle());
        }

    }


}
