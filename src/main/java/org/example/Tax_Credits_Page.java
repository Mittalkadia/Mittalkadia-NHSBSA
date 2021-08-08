package org.example;

import org.openqa.selenium.By;

public class Tax_Credits_Page extends Utils {
    Load_Property load_property = new Load_Property();
    private By _yes_tax = By.cssSelector("label#label-yes");


    public void click_On_Tax_Credit() {
        //expected url
        String url = "https://services.nhsbsa.nhs.uk/check-for-help-paying-nhs-costs/claim-benefits-tax-credits";
        //verify url
        assertCurrentURL(url);
        //print output
        System.out.println("Tax_Credits_Page assert =" + " " + load_property.getProperty("Tax_Credits_PageSOut"));
        //click yes
        clickOnElement(_yes_tax);

    }
}
