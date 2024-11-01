package com.cwsoft.solid.srp;

// Class responsible only for saving user data to the database
public class UserRepository {

    public void saveLogin(String username) {
        System.out.println("Saving login for user " + username + " to the database.");
    }
}
