package com.twu.biblioteca;

import java.util.*;

public class Menu {

    private Library library;

    public Menu(Library library) {
        this.library = library;
    }

    public void displayMenu() {
        System.out.println("Here is a menu of options to choose from:");
        System.out.println("a. List of books");
    }

    public void userOption(char userInput) {
        if (userInput == 'a') {
            library.printLibrary();
        } else {
            System.out.println("please select a valid option!");
        }
    }
}
