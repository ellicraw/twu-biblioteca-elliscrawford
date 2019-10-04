package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class LibraryTest {

    private Library library;
    private ByteArrayOutputStream outputStream;

    @Before
    public void setUp()  {
        library = new Library();
        library.createLibrary();
    }

    @Test
    public void canListBooks(){
        outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);
        library.printLibrary();

        assertEquals("Title | Author | Publication Year\n"
                + "---------------------------------\n"
                + "Animal Farm | George Orwell | 1945\n"
                + "Educated | Tara Westover | 2018\n"
                + "The Catcher in the Rye | J. D. Salinger | 1951\n",outputStream.toString());




    }

}