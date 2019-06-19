package com.twu.biblioteca;
import main.java.com.twu.biblioteca.Book;
import org.junit.Test;

import static org.junit.Assert.*;

public class BookTest {
    private Book book = new Book("Othello", "Shakespeare", "2017");

    @Test
    public void info() {
        String bookString = book.info();
        assertTrue(bookString.contains("Othello--+Shakespeare--2017"+"\n"));
    }

    @Test
    public void getName() {
        assertEquals("Othello", book.getName());
    }

    @Test
    public void isAvailable() {
        assertEquals("Othello", book.isAvailable());
    }

    @Test
    public void setAvailable() {
    }
}