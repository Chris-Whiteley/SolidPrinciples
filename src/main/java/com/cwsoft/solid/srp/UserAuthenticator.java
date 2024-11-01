package com.cwsoft.solid.srp;

// Class responsible only for authentication
public class UserAuthenticator {

    public boolean authenticate(String username, String password) {
        return username.equals("admin") && password.equals("password123");
    }
}
