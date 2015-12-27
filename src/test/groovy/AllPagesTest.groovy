import geb.junit4.GebReportingTest
import org.junit.After
import org.junit.Before
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

    private static String OS = System.getProperty("os.name").toLowerCase();

    // Create global variables
    public WebDriver driver

    //chromedriver for Mac OS by default
    private String pathToDriver = 'src/res/mac/chromedriver'

    // Create global objects of tester
    PageHomeTest pht = new PageHomeTest()
    PageSearchTest pst = new PageSearchTest()
    PageSignInTest psit = new PageSignInTest()

    public static boolean isMac() {
        return (OS.indexOf("mac") >= 0);
    }

    public static boolean isUnix() {
        return (OS.indexOf("nix") >= 0 || OS.indexOf("nux") >= 0 || OS.indexOf("aix") > 0 );
    }

    /**
     * Setup the browser driver before
     * In this case, we will only use Chrome
     * Also no need to instantiate the driver
     */
    @Before
    void setUp() {

        System.out.println(OS);

        if (isUnix()){
            pathToDriver = 'src/res/linux/chromedriver'
        }

        System.setProperty('webdriver.chrome.driver', pathToDriver)
        driver = new ChromeDriver()
        driver.get("https://github.com")
    }

    /**
     * Test for page home
     */
    @Test
    void testPageHome() {
        pht.testSignUp()
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
        psit.testSignIn()
    }

    /**
     * Close the browser driver after
     */
    @After
    void tearDown() {
        System.out.print("Testing session ended")
    }
}
