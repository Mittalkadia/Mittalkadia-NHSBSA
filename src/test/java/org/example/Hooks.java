package org.example;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends Utils {
    //create object for browser selector object
    Browser_Selector browserSelector = new Browser_Selector();

    @Before
    public void OpenBrowser() {
        //open browser
        browserSelector.open_Browser();
        //open URL
        driver.get("https://services.nhsbsa.nhs.uk/check-for-help-paying-nhs-costs/start");
    }

    @After
    public void closeBrowser() {
        //close browser
       // driver.quit();
    }
}
