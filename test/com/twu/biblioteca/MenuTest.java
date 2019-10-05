package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;


public class MenuTest {
    private Library library = new Library();
    private Menu menu = new Menu(library);
    private ByteArrayOutputStream outputStream;

    @Test
    public void canMenuDisplay() {
        outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);
        menu.displayMenu();

        assertEquals("Here is a menu of options to choose from:\n" + "a. List of books\n", outputStream.toString());
    }

    @Test
    public void isUserInputValid() {
        char userInput = 's';
        outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);
        menu.userOption(userInput);

        assertEquals("please select a valid option!\n", outputStream.toString());
    }
}