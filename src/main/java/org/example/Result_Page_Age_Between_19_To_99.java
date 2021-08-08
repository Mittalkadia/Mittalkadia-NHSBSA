package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class Result_Page_Age_Between_19_To_99 extends Utils {

    Load_Property load_property = new Load_Property();
    private By _message_Verification = By.cssSelector("h2.heading-large");

    public void verify_User_age19To60_massage() {
        //verify assert
        Assert.assertEquals(get_Text_From_Element(_message_Verification), "Based on what you've told us\n" +
                "You get help with NHS costs", "Type date of birth between 19 to 99 age");
        //print output
        System.out.println(load_property.getProperty("Result_Page_Age_Between_19_To_99SOut"));
    }
}
