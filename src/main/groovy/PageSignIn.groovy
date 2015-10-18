import geb.Page

/**
 * PageSignIn
 *
 * Setup the page on sign in page
 * Also have the sign in module within the page
 */

class PageSignIn extends Page {

    /**
     * Go to GitHub sign in page.
     * Noted that GitHub says sign in with its header button but the route says login.
     */
    static url = 'https://github.com/login'

    /**
     * Contain the sign in module
     */
    static content = {
        moduleSignIn {module ModuleSignIn}
    }
}
