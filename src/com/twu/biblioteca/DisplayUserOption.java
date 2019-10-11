package com.twu.biblioteca;

public class DisplayUserOption implements MenuOptions{
    @Override
    public String name() {
        return "(e) Display User Information";
    }

    @Override
    public String getAction() {
        return "e";
    }

    @Override
    public void run(Library library) {
        library.displayUserInfo();
    }
}
