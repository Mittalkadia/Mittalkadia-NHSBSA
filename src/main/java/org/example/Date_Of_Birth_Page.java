package org.example;

import org.openqa.selenium.By;


public class Date_Of_Birth_Page extends Utils {
    Load_Property loadProperty = new Load_Property();
    private By _type_DayOfBirth = By.cssSelector("input#dob-day");
    private By _type_MonthOfBirth = By.cssSelector("input#dob-month");
    private By _type_YearOfBirth = By.cssSelector("input#dob-year");


    public void type_Date_Of_Birth() {
        //expected url
        String url = "https://services.nhsbsa.nhs.uk/check-for-help-paying-nhs-costs/date-of-birth";
        //verify url
        assertCurrentURL(url);
        //print output
        System.out.println("Date_Of_Birth_Page assert =" + " " + loadProperty.getProperty("Date_Of_Birth_PageSOut"));
        //enter day of birth
        enterText(_type_DayOfBirth, loadProperty.getProperty("BirthDate"));
        //enter month of birth
        enterText(_type_MonthOfBirth, loadProperty.getProperty("BirthMonth"));
        //enter year of birth
        enterText(_type_YearOfBirth, loadProperty.getProperty("BirthYear"));

    }

}

