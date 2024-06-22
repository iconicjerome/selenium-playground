package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JQuerySelectDropdown {
    public WebDriver driver;
    //use this constructor to initialize the elements
    public JQuerySelectDropdown(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this );
    }
    // page elements

    @FindBy(id = "select2-country-container")
    public WebElement countryDropdown;

}
