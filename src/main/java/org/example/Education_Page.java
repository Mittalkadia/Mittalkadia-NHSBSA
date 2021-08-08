package org.example;

import org.openqa.selenium.By;


public class Education_Page extends Utils {
    Load_Property load_property = new Load_Property();
    private By _education_yes = By.cssSelector("label#label-yes");

    public void click_On_Full_Time_Education() {
        //expected url
        String url = "https://services.nhsbsa.nhs.uk/check-for-help-paying-nhs-costs/full-time-education";
        //verify url
        assertCurrentURL(url);
        //print output
        System.out.println("Education_Page assert = " + " " + load_property.getProperty("EducationPageSOut"));
        //click yes
        clickOnElement(_education_yes);

    }

}

