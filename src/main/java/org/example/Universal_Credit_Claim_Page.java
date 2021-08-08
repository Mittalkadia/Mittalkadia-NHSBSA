package org.example;

import org.openqa.selenium.By;


public class Universal_Credit_Claim_Page extends Utils {
    private By _universal = By.xpath("//label[@for='yes-universal']");

    public void click_on_Universal_Credit() {
        //click yes
        clickOnElement(_universal);

    }
}
