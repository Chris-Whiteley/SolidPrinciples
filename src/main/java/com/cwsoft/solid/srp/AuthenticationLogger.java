package com.cwsoft.solid.srp;

// Class responsible only for logging authentication attempts
public class AuthenticationLogger {

    public void log(String username, boolean success) {
        if (success) {
            System.out.println("User " + username + " successfully logged in.");
        } else {
            System.out.println("User " + username + " failed to log in.");
        }
    }
}