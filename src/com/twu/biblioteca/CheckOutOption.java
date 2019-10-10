package com.twu.biblioteca;

public class CheckOutOption implements MenuOptions {
    @Override
    public String name() {
        return "(b) Checkout Book";
    }

    @Override
    public String getAction() {
        return "b";
    }

    @Override
    public void run(Library library) {
        library.checkOut();
    }
}
