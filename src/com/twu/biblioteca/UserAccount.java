package com.twu.biblioteca;

import java.util.Scanner;

public class UserAccount {
    private String userAccountNum;
    private String password;
    Scanner scan = new Scanner(System.in);

    public UserAccount(String userAccountNum, String password){
        this.userAccountNum = userAccountNum;
        this.password = password;
    }

    public String setUserAccountNum() {
        String AccountNum;
        System.out.print("Please enter your user account number in a xxx-xxxx format: ");
        AccountNum = scan.nextLine();
        return AccountNum;
    }

    public String setUserAccountPW() {
        String AccountPW;
        System.out.print("Please enter your user account password: ");
        AccountPW = scan.nextLine();
        return AccountPW;
    }

    public void getUserAccountNum() {
        System.out.println(userAccountNum);
    }

    public boolean isUserAccountNumValid(String userInput) {
        return userAccountNum.equals(userInput);
    }

    public boolean isUserAccountPWValid(String userInput) {
        return password.equals(userInput);
    }

}
