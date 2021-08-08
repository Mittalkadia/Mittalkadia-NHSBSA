package org.example;

import org.openqa.selenium.By;

public class Partner_Page extends Utils {
    Load_Property load_property = new Load_Property();
    private By _click_yes_married = By.cssSelector(" label#label-yes");


    public void click_On_Married() {
        //expected url
        String url = "https://services.nhsbsa.nhs.uk/check-for-help-paying-nhs-costs/partner";
        //verify assert
        assertCurrentURL(url);
        //print output
        System.out.println("Partner_Page assert =" + " " + load_property.getProperty("Partner_PageSOut"));
        //click yes
        clickOnElement(_click_yes_married);


    }
}
