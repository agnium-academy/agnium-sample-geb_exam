import geb.junit4.GebReportingTest
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

/**
 * PageSearchTest
 *
 * Test page search with its modules.
 */

@RunWith(JUnit4)
class PageSearchTest extends GebReportingTest {

    public PageSearch ps

    /**
     * Test search for desired keyword and repo result
     *
     * @param keyword
     * @param repoResult
     */
    void testSearchFor(String keyword, String repoResult) {
        ps = to(PageSearch)
        ps.moduleSearch.searchWithKeyword(keyword)
        assert ps.moduleSearch.firstSearchResultText == repoResult
        ps.moduleSearch.firstSearchResult.click()
    }

    /**
     * Test search for keyword: Git
     * Should have the first result title text: git/git
     */
    @Test
    void testSearchForGit() {
        testSearchFor('git', 'git')
    }

    /**
     * Test search for keyword: linux
     * Should have the first result title text: torvalds/linux
     */
    @Test
    void testSearchForLinux() {
        testSearchFor('linux', 'linux')
    }

}
