import geb.junit4.GebReportingTest
import org.junit.After
import org.junit.Before
import org.junit.Ignore
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4
import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver

/**
 * AllPagesTest
 *
 * Test all of the available pages with their modules.
 */

@RunWith(JUnit4)
class AllPagesTest extends GebReportingTest {

    // Create global variables
    public WebDriver driver

    // Create global objects of tester
    PageHomeTest pht = new PageHomeTest()
    PageSearchTest pst = new PageSearchTest()
    PageSignInTest psit = new PageSignInTest()

    /**
     * Setup the browser driver before
     * In this case, we will only use Chrome
     * Also no need to instantiate the driver
     */
    @Before
    void setUp() {
        // Download the chrome driver from this url:
        // https://sites.google.com/a/chromium.org/chromedriver/downloads
        // then place it into your directory, and change the second params of setProperty below
        System.setProperty(
                'webdriver.chrome.driver',
                '/Users/c07hn00jdjd0/Documents/App2/chromedriver')
        // driver = new ChromeDriver()
        // driver.get("https://github.com")
    }

    /**
     * Test for page home
     */
    @Test
    void testPageHome() {
        pht.testFillSignUp()
    }

    /**
     * Test for page search
     */
    @Test
    void testPageSearch() {
        pst.testSearchForGit()
        pst.testSearchForLinux()
    }

    /**
     * Test for page sign in
     */
    @Test
    void testPageSignIn() {
        psit.testSignInInvalidCredentials()
    }

    /**
     * Close the browser driver after
     */
    @After
    void tearDown() {
        System.out.print("Testing session ended")
    }

}
