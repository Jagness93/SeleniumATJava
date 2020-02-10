package PageObjects;

import org.openqa.selenium.WebDriver;

public class DirectResultPage extends PageObject {

    public DirectResultPage(WebDriver driver) {
        super(driver);
    }

    public String DirectResultPageInitialized(){
        return driver.getCurrentUrl();
    }

}
