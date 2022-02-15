package com.getStart.withSpringMvc.model;

public class User {
    String uName;
    String emailD;
    String passwordD;

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public String getEmailD() {
        return emailD;
    }

    public void setEmailD(String emailD) {
        this.emailD = emailD;
    }

    public String getPasswordD() {
        return passwordD;
    }

    public void setPasswordD(String passwordD) {
        this.passwordD = passwordD;
    }

    public User(String uName, String emailD, String passwordD) {
        this.uName = uName;
        this.emailD = emailD;
        this.passwordD = passwordD;
    }

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "uName='" + uName + '\'' +
                ", emailD='" + emailD + '\'' +
                ", passwordD='" + passwordD + '\'' +
                '}';
    }
}
