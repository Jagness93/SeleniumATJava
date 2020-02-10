package Tests;

import PageObjects.DirectResultPage;
import PageObjects.HomePage;
import PageObjects.ResultPage;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertFalse;
import static org.testng.AssertJUnit.assertTrue;

public class HomepageTests extends testsBase{


    @Test
    public void checkSearching() {

        //go to google page
        driver.get("http://www.google.pl");
        HomePage homePage = new HomePage(driver);
        //check if displayed correctly
        assertTrue(homePage.isInitialized());
        //fill query
        homePage.fillQueryField("test");
        //go to results page
        ResultPage resultPage = homePage.clickSearchButton();
        //check if result page is displayed
        assertTrue(resultPage.isInitialized());
        //check if is more than 1 result
        assertTrue(resultPage.checkQueryResults("test") > 1);
    }

    @Test
    public void checkLuckySearch() {

        //go to google page
        driver.get("http://www.google.pl");
        HomePage homePage = new HomePage(driver);
        //check if displayed correctly
        assertTrue(homePage.isInitialized());
        //fill query
        homePage.fillQueryField("test");
        //go to results page
        DirectResultPage directPage = homePage.ClickIFeelingLucky();
        //check If user was redirect directly to result of search
        assertFalse(directPage.DirectResultPageInitialized().contains("google"));
    }

}
