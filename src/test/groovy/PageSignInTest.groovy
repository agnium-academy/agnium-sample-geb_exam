import geb.junit4.GebReportingTest
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

/**
 * PageSignInTest
 *
 * Test page sign in with its modules.
 */

@RunWith(JUnit4)
class PageSignInTest extends GebReportingTest {

    public PageSignIn psi

    /**
     * Test search for desired username, password, and appeared indicator
     *
     * @param username
     * @param password
     * @param message
     */
    void testSignInWith(String username, String password, String indicator) {
        psi = to(PageSignIn)
        psi.moduleSignIn.signIn(username, password)
        assert psi.moduleSignIn.flashMessage == indicator
    }

    /**
     * Test sign in with
     * username: agnium
     * password: invalidpassword
     * Should flash a message: incorrect username or password
     */
    @Test
    void testSignInInvalidCredentials() {
        testSignInWith('username', 'password', 'Incorrect username or password.')
    }

}
