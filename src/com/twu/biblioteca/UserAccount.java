package com.twu.biblioteca;

import java.util.Scanner;

public class UserAccount {
    private String userAccountNum;
    private String userPassword;
    private String userName;
    private String userEmail;
    private String userPhoneNum;

    Scanner scan = new Scanner(System.in);

    public UserAccount(String userAccountNum, String userPassword, String userName, String userEmail, String userPhoneNum){
        this.userAccountNum = userAccountNum;
        this.userPassword = userPassword;
        this.userName = userName;
        this.userEmail = userEmail;
        this.userPhoneNum = userPhoneNum;
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
        return userPassword.equals(userInput);
    }

    public String getUserName(){
        return userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public String getUserPhoneNum() {
        return userPhoneNum;
    }

}
