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
        Welcome welcome = new Welcome();
        UserAccount user = new UserAccount("123-4567", "xxxx","bigUser1", "user@email.com", "0123456789");
        Library library = setupLibrary(user);
        Menu menu = setupMenu(library);

        welcome.welcomeMessage();
        if (user.isUserAccountNumValid(user.setUserAccountNum()) && user.isUserAccountPWValid(user.setUserAccountPW())) {
            while (true) {
                menu.showOptions();
                Scanner scan = new Scanner(System.in);
                String userInput = scan.nextLine();
                if (menu.isValidOption(userInput)) {
                    menu.chooseOption(userInput);
                } else {
                    System.out.println("Sorry, please choose a valid option");
                }
            }
        }
        else {
            System.out.println("Sorry, one of your fields is not valid");
            runApp();
        }
    }

    private Library setupLibrary(UserAccount user){
        Library library = new Library(user);
        Book b1 = new Book("Animal Farm", "George Orwell", 1945);
        Book b2 = new Book("Educated", "Tara Westover", 2018);
        Book b3 = new Book("The Catcher in the Rye","J. D. Salinger", 1951);
        Movie m1 = new Movie("Moonlight", 2016, "Barry Jenkins", 9);
        Movie m2 = new Movie("Lady Bird", 2017, "Greta Gerwig", 9);
        Movie m3 = new Movie("The Big Sick", 2017, "Michael Showalter", 8);
        library.addBooks(b1, b2, b3);
        library.addMovies(m1, m2, m3);
        return library;
    }

    private Menu setupMenu(Library library){
        ListBooksOption listBooksOption = new ListBooksOption();
        ListMoviesOption listMoviesOption = new ListMoviesOption();
        CheckInOption checkInOption = new CheckInOption();
        CheckOutOption checkOutOption = new CheckOutOption();
        DisplayUserOption displayUserOption = new DisplayUserOption();
        QuitOption quitOption = new QuitOption();
        Menu menu = new Menu(library);
        menu.addOptions(listBooksOption, listMoviesOption,checkInOption, checkOutOption, displayUserOption ,quitOption);
        return menu;
    }

}
