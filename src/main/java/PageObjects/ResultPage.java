package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ResultPage extends PageObject {

    public ResultPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(id = "resultStats")
    private WebElement resultStats;


    public boolean isInitialized() {
        return resultStats.isDisplayed();
    }

    public int checkQueryResults(String query){
        int numberOfheaders = 0;
        numberOfheaders = driver.findElements(By.xpath("//h3[contains(text(),'"+query+"')]")).size();
        return numberOfheaders;
    }

}
