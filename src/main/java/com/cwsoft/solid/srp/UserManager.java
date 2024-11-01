package com.cwsoft.solid.srp;

// Manager class responsible for coordinating the actions

/**
 * Benefits of SRP in the refactored example:
 * Separation of Concerns: Each class (UserAuthenticator, AuthenticationLogger, UserRepository) has a clear,
 * single responsibility.
 *
 * Easier Maintenance: If logging or database logic changes, we only need to modify the AuthenticationLogger
 * or UserRepository classes, without touching the authentication logic.
 *
 * Testability: Each class can be tested independently, making unit testing easier.
 * By following SRP, the code becomes cleaner, easier to maintain, and more modular.
 */

public class UserManager {

    private UserAuthenticator authenticator = new UserAuthenticator();
    private AuthenticationLogger logger = new AuthenticationLogger();
    private UserRepository repository = new UserRepository();

    public void authenticateUser(String username, String password) {
        boolean isAuthenticated = authenticator.authenticate(username, password);
        logger.log(username, isAuthenticated);

        if (isAuthenticated) {
            repository.saveLogin(username);
        }
    }
}
