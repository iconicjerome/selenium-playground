package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    public WebDriver driver;
    //use this constructor to initialize the elements
    public HomePage(WebDriver driver){
        this.driver =driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(linkText = "JQuery Select dropdown")
    public WebElement JQuerySelectDropdown;
}
