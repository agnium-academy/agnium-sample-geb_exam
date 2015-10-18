import geb.Module

/**
 * ModuleSignIn
 *
 * All the components in sign in module are enabling user
 * to do sign in after they successfully registered
 */

class ModuleSignIn extends Module {

    /**
     * Define all the required components in sign in module.
     */
    static content = {
        usernameInput { $('input#login_field') }
        passwordInput { $('input#password') }
        signInButton { $('input.btn[type="submit"]') }
        flashMessage { $('div.flash div.container').text() }
    }

    /**
     * Have the ability to login with entered username
     *
     * @param String username
     * @param String password
     */
    void signIn(String username, String password){
        usernameInput.value(username)
        passwordInput.value(password)
        signInButton.click()
    }

}
