package com.twu.biblioteca;
import java.time.LocalDate;
import java.util.*;
import java.lang.*;

public class BibliotecaApp {

    public static void main(String[] args) {
    BibliotecaApp biblioteca = new BibliotecaApp();
    biblioteca.runApp();

    }

    public void runApp() {
        Welcome message = new Welcome();
        Library library = setupLibrary();
        Menu menu = setupMenu(library);

        message.welcomeMessage();

        while(true) {
            menu.showOptions();
            Scanner scan = new Scanner(System.in);
            String userInput = scan.nextLine();
            if(menu.isValidOption(userInput)) {
                menu.chooseOption(userInput);
            }
            else {
                System.out.println("Sorry, please choose a valid option");

            }
        }

    }

    private Library setupLibrary(){
        Library library = new Library();
        Book b1 = new Book("Animal Farm", "George Orwell", 1945);
        Book b2 = new Book("Educated", "Tara Westover", 2018);
        Book b3 = new Book("The Catcher in the Rye","J. D. Salinger", 1951);
        library.addBooks(b1, b2, b3);
        return library;
    }

    private Menu setupMenu(Library library){
        ListBooksOption listBooksOption = new ListBooksOption();
        CheckOutOption checkOutOption = new CheckOutOption();
        CheckInOption checkInOption = new CheckInOption();
        QuitOption quitOption = new QuitOption();
        Menu menu = new Menu(library);
        menu.addOptions(listBooksOption,checkOutOption,checkInOption,quitOption);
        return menu;
    }

}
