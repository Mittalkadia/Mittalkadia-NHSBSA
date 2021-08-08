package org.example;

import org.openqa.selenium.By;

public class Country_Page extends Utils {
    Load_Property loadProperty = new Load_Property();
    private By _radio_Button = By.cssSelector("label#label-wales");
    private By _click_Next = By.cssSelector("input#next-button.button");

    public void click_On_Radio_Button() {
        //expected url
        String url = "https://services.nhsbsa.nhs.uk/check-for-help-paying-nhs-costs/where-you-live";
        //verify url
        assertCurrentURL(url);
        //print output
        System.out.println("Country_Page assert =" + " " + loadProperty.getProperty("CountryPageSOut"));
        //click on radio button
        clickOnElement(_radio_Button);
    }

    public void click_On_Next_Button() {
        //click on next button
        click_On_Next_Button(_click_Next);

    }
}
