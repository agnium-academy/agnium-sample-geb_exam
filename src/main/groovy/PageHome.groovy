import geb.Browser
import geb.Page

/**
 * PageHome
 *
 * Setup the page on home page
 * Also have the sign up module within the page
 */

class PageHome extends Page {

    /**
     * Go to GitHub search page.
     */
    static url = 'https://github.com'

    /**
     * Contain the sign up module.
     */
    static content = {
        moduleHomeSignUp {module ModuleHomeSignUp}
    }

}
