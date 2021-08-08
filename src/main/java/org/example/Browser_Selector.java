package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Browser_Selector extends Base_Page {
    //create object for load property
    Load_Property loadProperty = new Load_Property();
    //create browserName variable
    String browserName = loadProperty.getProperty("browser");

    public void open_Browser() {
        if (browserName.equalsIgnoreCase("chrome")) {
            //setting up chrome driver from WebDriver manager
            WebDriverManager.chromedriver().setup();
            //create object for chrome driver
            driver = new ChromeDriver();
        } else if (browserName.equalsIgnoreCase("firefox")) {
            //setting up firefox driver from WebDriver manager
            WebDriverManager.firefoxdriver().setup();
            //create object for firefox driver
            driver = new FirefoxDriver();
        } else {//print invalid browser name
            System.out.println("Incorrect browser name or empty" + " " + browserName);
        }
        //maximize the browser window
        driver.manage().window().maximize();
        //Apply implicitlyWait to driver object
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
}
