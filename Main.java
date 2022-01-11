package com.example.main;

import com.example.id.IDandPasswords;
import com.example.login.LoginPage;

public class Main {
    public static void main(String[] args) {
        IDandPasswords idandPasswords = new IDandPasswords();
        LoginPage loginPage = new LoginPage(idandPasswords.getLoginInfo());
    }
}
