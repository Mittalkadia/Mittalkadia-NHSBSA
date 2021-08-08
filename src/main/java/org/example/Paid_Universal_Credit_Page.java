package org.example;

import org.openqa.selenium.By;

public class Paid_Universal_Credit_Page extends Utils {

    private By _click_yes = By.cssSelector("label#label-yes");


    public void click_On_Universal_Credit_Law() {
        //click yes
        clickOnElement(_click_yes);


    }
}
