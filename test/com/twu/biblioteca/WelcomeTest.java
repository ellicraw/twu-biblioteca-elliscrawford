package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class WelcomeTest {

    private Welcome welcome = new Welcome();
    private ByteArrayOutputStream outputStream;

    @Test
    public void isWelcomeDisplayed() {
        outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);
        welcome.welcomeMessage();

        assertEquals("Welcome to Biblioteca. Your one-stop-shop got great book titles in Bangalore!\n", outputStream.toString());

    }
}