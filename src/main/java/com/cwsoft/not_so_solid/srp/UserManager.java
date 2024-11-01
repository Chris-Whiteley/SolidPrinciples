package com.cwsoft.not_so_solid.srp;

/**
 * Problems with this example:
 * The UserManager class is responsible for multiple responsibilities:
 * Authenticating users.
 * Logging the authentication attempts.
 * Saving user login details to the database.
 * If we need to change the logging mechanism (e.g., writing logs to a file instead of the console), or change the
 * database implementation, the UserManager class will have to be modified.
 * This tightly couples different concerns, which violates SRP.
 */
public class UserManager {

    // Handles user authentication
    public boolean authenticateUser(String username, String password) {
        // Authentication logic
        if (username.equals("admin") && password.equals("password123")) {
            // Log successful login
            logAuthenticationAttempt(username, true);
            // Save login to database
            saveUserLoginToDatabase(username);
            return true;
        } else {
            // Log failed login attempt
            logAuthenticationAttempt(username, false);
            return false;
        }
    }

    // Logs the authentication attempts to a file (Responsibility 1: Logging)
    private void logAuthenticationAttempt(String username, boolean success) {
        if (success) {
            System.out.println("User " + username + " successfully logged in.");
        } else {
            System.out.println("User " + username + " failed to log in.");
        }
    }

    // Saves user login details to the database (Responsibility 2: Data storage)
    private void saveUserLoginToDatabase(String username) {
        System.out.println("Saving login for user " + username + " to the database.");
        // Logic for saving to the database
    }
}
