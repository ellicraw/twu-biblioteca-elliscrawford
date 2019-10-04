package com.twu.biblioteca;


import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BookTest {

    private Book book;

    @Before
    public void setUpBook() {
        book = new Book("Becoming", "Michelle Obama", 2018);
    }
    @Test
    public void canGetTitle() {
        assertEquals( "Becoming", book.getTitle());
    }

    @Test
    public void canGetAuthor() {
        assertEquals( "Michelle Obama", book.getAuthor());
    }
}
