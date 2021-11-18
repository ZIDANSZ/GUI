package com.company;

public class Main {

    public static void main(String[] args) {
        Id_Password idPassword = new Id_Password();
        Login_Page login_page = new Login_Page(idPassword.getLoginInfo());

    }
}
