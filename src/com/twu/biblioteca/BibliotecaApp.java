package com.twu.biblioteca;
import java.time.LocalDate;
import java.util.*;
import java.lang.*;

public class BibliotecaApp {

    public static void main(String[] args) {
        Welcome message = new Welcome();
        message.welcomeMessage();
//        System.out.println("Welcome to Biblioteca. Your one-stop-shop got great book titles in Bangalore!");

        Library lib = new Library();
        ArrayList<Book> library = lib.createLibrary();
        lib.printLibrary();


    }


}
