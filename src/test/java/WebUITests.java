import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class
 WebUITests {

    private WebDriver driver;

    private void waitForTimeout(long milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    
    private void waitFor(long milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @BeforeMethod
    public void setupMethod() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        System.out.println("Before Method: Setup WebDriver and navigate to the site");
        driver.get("http://localhost:9090/my-project-1.0-SNAPSHOT/");
    }

    @Test
    public void verifyPageTitle() {
        driver.manage().window().maximize();
        waitForTimeout(3000);
        String pageTitle = driver.getTitle();
        Assert.assertEquals(pageTitle, "Insured Assurance Company");
        System.out.println("Test: Page title verified");
    }

    @AfterMethod
    public void teardownMethod() {
        if (driver != null) {
            driver.quit();
        }
        System.out.println("After Method: Clean up WebDriver");
    }
}