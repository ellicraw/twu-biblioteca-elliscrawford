package com.twu.biblioteca;

public class CheckOutOption implements MenuOptions {
    @Override
    public String name() {
        return "(d) Checkout Book";
    }

    @Override
    public String getAction() {
        return "d";
    }

    @Override
    public void run(Library library) {
        library.checkOut();
    }
}
