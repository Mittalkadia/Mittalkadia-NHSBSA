package org.example;

import org.openqa.selenium.By;

public class Credit_Take_Home_Page extends Utils {
    Load_Property load_property = new Load_Property();
    private By _click_yes_homePay = By.cssSelector("label#label-yes");


    public void click_On_Yes_Home_Pay() {
        //expected url
        String url = "https://services.nhsbsa.nhs.uk/check-for-help-paying-nhs-costs/universal-credit-take-home-pay";
        //verify url
        assertCurrentURL(url);
        //print output
        System.out.println("Credit_Take_Home_Page assert =" + " " + load_property.getProperty("Credit_Take_Home_PageSOut"));
        //click yes
        clickOnElement(_click_yes_homePay);


    }


}
