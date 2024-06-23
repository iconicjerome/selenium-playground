package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class JQuerySelectDropdown {
    public WebDriver driver;
    //use this constructor to initialize the elements
    public JQuerySelectDropdown(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this );
    }
    // page elements

    @FindBy(xpath = "//*[@id=\"__next\"]/div/section[2]/div/div/div/div[1]/div[2]/span/span[1]/span")
    public WebElement countryDropdown;
    @FindBy(className = "select2-results__options")
    public List<WebElement> dropdownList;

}
