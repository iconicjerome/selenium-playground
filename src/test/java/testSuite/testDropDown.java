package testSuite;

import PageObjects.HomePage;
import PageObjects.JQuerySelectDropdown;
import Utils.Globals;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class testDropDown extends Globals {

    //write tests below
    @Test
    public void dropDownTest(){
        JQuerySelectDropdown jQuerySelectDropdown = new JQuerySelectDropdown(driver);
        HomePage homePage = new HomePage(driver);
        homePage.JQuerySelectDropdown.click();
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();",  jQuerySelectDropdown.countryDropdown);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOf(jQuerySelectDropdown.countryDropdown));
        // use the select method to select dropdown
//        Select dropdown = new Select(jQuerySelectDropdown.countryDropdown);
//        dropdown.selectByIndex(0);
    }
}
