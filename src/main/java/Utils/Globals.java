package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Globals {
    public WebDriver driver;

    //use this method to start the browser
    @BeforeSuite
    public WebDriver startBrowser(){
        String url = "https://www.lambdatest.com/selenium-playground/";
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get(url);
        return driver;
    }

    //use this method to close browser and end tests
    @AfterSuite
    public void closeBrowser(){
        driver.quit();
    }

}
