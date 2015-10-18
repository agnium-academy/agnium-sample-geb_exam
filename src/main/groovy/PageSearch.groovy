import geb.Page

/**
 * PageSearch
 *
 * Setup the page on search page
 * Also have the search module within the page
 */

class PageSearch extends Page {

    /**
     * Go to GitHub search page.
     */
    static url = 'https://github.com/search'

    /**
     * Contain the search module.
     */
    static content = {
        moduleSearch {module ModuleSearch}
    }
}
