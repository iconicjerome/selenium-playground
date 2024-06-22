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
    @FindBy(xpath = "//span[@class='select2 select2-container select2-container--default select2-container--focus']//span[@role='combobox']")
    public WebElement countryDropdown;

}
