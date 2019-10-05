package com.twu.biblioteca;
import java.time.LocalDate;
import java.util.*;
import java.lang.*;

public class BibliotecaApp {

    public static void main(String[] args) {
        Welcome message = new Welcome();
        message.welcomeMessage();
        Library lib = new Library();
        ArrayList<Book> library = lib.createLibrary();
        Menu menu = new Menu(lib);
        menu.displayMenu();


    }


}
