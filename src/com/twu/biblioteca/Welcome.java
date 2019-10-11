package com.twu.biblioteca;

import java.util.Scanner;

public class Welcome {
    private String userAccountNum;

    public Welcome(String userAccountNum){
        this.userAccountNum = userAccountNum;
    }


    public void welcomeMessage() {
        System.out.println("Welcome to Biblioteca. Your one-stop-shop got great book titles in Bangalore!");
        System.out.println("");
    }

    public String setUserAccountNum() {
        String userInput;
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter your user account number in a xxx-xxxx format: ");
        userInput = scan.nextLine();
        return userInput;
    }

    public void getUserAccountNum() {
        System.out.println(userAccountNum);
    }

    public boolean isUserAccountValid(String userInput) {
//        String userInput;
//        Scanner scan = new Scanner(System.in);
//        System.out.print("Please enter your user account number in a xxx-xxxx format: ");
//        userInput = scan.nextLine();
        return userAccountNum.equals(userInput);
    }


}
