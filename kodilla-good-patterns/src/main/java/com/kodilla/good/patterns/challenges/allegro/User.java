package com.kodilla.good.patterns.challenges.allegro;

public class User {
    private String userName;
    private String userSurname;
    private String userAddress;
    private String userEMail;
    private String userPhoneNumber;

    public User(String userName, String userSurname, String userAddress, String userEMail, String userPhoneNumber) {
        this.userName = userName;
        this.userSurname = userSurname;
        this.userAddress = userAddress;
        this.userEMail = userEMail;
        this.userPhoneNumber = userPhoneNumber;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserSurname() {
        return userSurname;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public String getUserEMail() {
        return userEMail;
    }

    public String getUserPhoneNumber() {
        return userPhoneNumber;
    }
}
