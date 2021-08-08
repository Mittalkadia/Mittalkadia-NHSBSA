package org.example;

import org.openqa.selenium.By;

public class Home_Page extends Utils {
    Load_Property loadProperty = new Load_Property();
    private By _cookies = By.cssSelector("button#nhsuk-cookie-banner__link_accept");
    private By _start_Button = By.cssSelector(" input#next-button");

    public void click_On_Start_Button() {
        //expected url
        String url = "https://services.nhsbsa.nhs.uk/check-for-help-paying-nhs-costs/start";
        //verify url
        assertCurrentURL(url);
        //print output
        System.out.println("Home_Page assert =" + " " + loadProperty.getProperty("HomepageSOut"));
        //click cookies
        clickOnElement(_cookies);
        //click start
        clickOnElement(_start_Button);
    }

}
