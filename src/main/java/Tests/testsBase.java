package Tests;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class testsBase {


        public static WebDriver driver = null;

        @BeforeSuite
        public void initialize() throws IOException {

            System.setProperty("webdriver.chrome.driver",
                    System.getProperty("user.dir") +
                            "\\src\\main\\java\\drivers\\chromedriver.exe");

            driver = new ChromeDriver();

            // To maximize browser
            driver.manage().window().maximize();

            // Implicit wait
            driver.manage().timeouts().implicitlyWait(
                    10, TimeUnit.SECONDS);

            // To open Gmail site
           // driver.get("https://www.gmail.com");
        }

        @AfterSuite
        // Test cleanup
        public void TeardownTest() {
            testsBase.driver.quit();
        }

}
