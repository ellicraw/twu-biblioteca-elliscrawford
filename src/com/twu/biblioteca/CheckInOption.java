package com.twu.biblioteca;

import com.twu.biblioteca.Library;
import com.twu.biblioteca.MenuOptions;

public class CheckInOption implements MenuOptions {
    @Override
    public String name() {
        return "(c) Checkin Book";
    }

    @Override
    public String getAction() {
        return "c";
    }

    @Override
    public void run(Library library) {
        library.checkIn();
    }
}
