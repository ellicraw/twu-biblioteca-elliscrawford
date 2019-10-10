package com.twu.biblioteca;

public class ListMoviesOption implements MenuOptions {
    @Override
    public String name() {
        return "(b) List Movies";
    }

    @Override
    public String getAction() {
        return "b";
    }

    @Override
    public void run(Library library) {
        library.printMovies();
    }
}
