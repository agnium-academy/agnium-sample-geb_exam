import geb.junit4.GebReportingTest
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

/**
 * PageHomeTest
 *
 * Test page home with its modules.
 */

@RunWith(JUnit4)
class PageHomeTest extends GebReportingTest {

    public PageHome ph

    /**
     * Test search for desired keyword and repo result
     *
     * @param keyword
     * @param repoResult
     */
    void testFillSignUpWith(String username, String email, String password) {
        ph = to(PageHome)
        ph.moduleHomeSignUp.fillSignUpFormWithCredentials()
    }

    /**
     * Test search for keyword: Git
     * Should have the first result title text: git/git
     */
    @Test
    void testFillSignUp() {
        testFillSignUpWith('username', 'email@domain.com', 'password')
    }



}
