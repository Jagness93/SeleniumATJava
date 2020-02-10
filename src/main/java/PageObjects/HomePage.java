package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageObject {

    public HomePage(WebDriver driver) {
        super(driver);

    }


    @FindBy(id = "hplogo")
    private WebElement header;
    @FindBy(name = "q")
    private WebElement query;
    @FindBy(name = "btnK")
    private  WebElement searchBtn;
    @FindBy(name = "btnI")
    private WebElement IFeelingLuckyBtn;


    public boolean isInitialized() {
        return header.isDisplayed();
    }

    public void fillQueryField(String queryFill){
        query.sendKeys(queryFill);
    }

    public ResultPage clickSearchButton(){
        searchBtn.click();
        return new ResultPage(driver);
    }

    public DirectResultPage ClickIFeelingLucky(){
        IFeelingLuckyBtn.click();
        return new DirectResultPage(driver);
    }




}
