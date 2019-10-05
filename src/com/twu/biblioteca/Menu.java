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
        System.out.println("q. Quit application");
        System.out.print("Choose an option: ");
        Scanner scan = new Scanner(System.in);
        char userInput = scan.next().charAt(0);
        userOption(userInput);
    }

    public void userOption(char userInput) {
        if (userInput == 'a') {
            library.printLibrary();
        }
        else if (userInput == 'q') {
            System.exit(0);
        }
        else {
            System.out.println("please select a valid option!");
        }
    }
}
