package com.twu.biblioteca;

public class QuitOption implements MenuOptions {

    @Override
    public String name() {
        return "(q) Quit";
    }


    @Override
    public String getAction() {
        return "q";
    }

    @Override
    public void run(Library library){
        System.exit(0);
    }
}
