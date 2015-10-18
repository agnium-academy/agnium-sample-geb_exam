import geb.Module

/**
 * ModuleSearch
 *
 * All the components in search module are enabling user
 * to do search operation within the website
 */

class ModuleSearch extends Module {

    /**
     * Define all the required components in search module.
     */
    static content = {
        searchInput { $('input.input-block') }
        searchButton { $('button.btn') }
        firstSearchResult { $('li:first-child.repo-list-item.public.source h3.repo-list-name a') }
        firstSearchResultText { firstSearchResult.text() }
    }

    /**
     * Have the ability to search with entered keyword.
     *
     * @param String keyword
     */
    void searchWithKeyword(String keyword){
        searchInput.value(keyword)
        searchButton.click()
    }

}
