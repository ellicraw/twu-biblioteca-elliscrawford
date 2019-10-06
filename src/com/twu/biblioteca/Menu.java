package com.twu.biblioteca;

import java.util.*;
import java.util.stream.Collectors;

public class Menu {

    private Library library;
    private ArrayList<MenuOptions> options;

    public Menu(Library library) {
        this.library = library;
        this.options = new ArrayList<MenuOptions>();
    }

    public void addOptions(MenuOptions... optionsToAdd) {
        for (MenuOptions ops : optionsToAdd) {
            options.add(ops);
        }
    }

    public void showOptions(){
        System.out.println("Please choose an option using the letter in parenthesis: ");
        options.forEach(option -> System.out.println(option.name()));
    }

    public void chooseOption(String userInput) {
        MenuOptions chosenOption = options.stream()
                .filter(option -> userInput.equals(option.getAction()))
                .collect(Collectors.toList())
                .get(0);
        chosenOption.run(library);
    }
}
