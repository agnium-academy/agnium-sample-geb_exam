import geb.Module

/**
 * ModuleHomeSignUp
 *
 * All the components in home sign up module are enabling user
 * to do sign up at the website home page
 */
class ModuleHomeSignUp extends Module {

    /**
     * Define all the required components in search module.
     */
    static content = {
        usernameInput { $('input[name="user[login]"]') }
        emailInput { $('input[name="user[email]"]') }
        passwordInput { $('input[name="user[password]"]') }
    }

    /**
     * Have the ability to sign up with required credentials.
     *
     * @param username
     * @param email
     * @param password
     */
    void fillSignUpFormWithCredentials(String username, String email, String password) {
        usernameInput.value(username)
        emailInput.value(email)
        passwordInput.value(password)
        // No need to actually sign up with "Sign up for GitHub account" button
    }

}
