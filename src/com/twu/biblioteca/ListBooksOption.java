package com.twu.biblioteca;

public class ListBooksOption implements MenuOptions {
    @Override
    public String name() {
        return "(a) List Books";
    }

    @Override
    public String getAction() {
        return "a";
    }

    @Override
    public void run(Library library) {
            library.printBooks();
    }
}
