package testSuite;
import PageObjects.HomePage;
import PageObjects.JQuerySelectDropdown;
import Utils.Globals;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import java.time.Duration;

public class testDropDown extends Globals {

    //write tests below
    @Test
    public void dropDownTest(){
        try {
            JQuerySelectDropdown jQuerySelectDropdown = new JQuerySelectDropdown(driver);
            HomePage homePage = new HomePage(driver);
            homePage.JQuerySelectDropdown.click();
            jQuerySelectDropdown.countryDropdown.click();
            // Wait until dropdown items are visible
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
            wait.until(ExpectedConditions.visibilityOfAllElements(jQuerySelectDropdown.dropdownList));
            //iterate through the desired list to get the desired option
            for(WebElement item : jQuerySelectDropdown.dropdownList){
                if(item.getText().contains("India")){
                    item.click();
                    break;
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
