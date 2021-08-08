package org.example;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyStepDefs {
    Home_Page homePage = new Home_Page();
    Country_Page countryPage = new Country_Page();
    Date_Of_Birth_Page dateOfBirthPage = new Date_Of_Birth_Page();
    Result_Under_Age16_Page resultUnder16Page = new Result_Under_Age16_Page();
    Education_Page education_page = new Education_Page();
    Result_Page_Age_Between_17To19 result_page_age_between_17To19 = new Result_Page_Age_Between_17To19();
    Universal_Credit_Claim_Page universal_credit_page = new Universal_Credit_Claim_Page();
    Tax_Credits_Page tax_credits_page = new Tax_Credits_Page();
    Paid_Universal_Credit_Page universal_credit_claim_page = new Paid_Universal_Credit_Page();
    Credit_Take_Home_Page take_home_page = new Credit_Take_Home_Page();
    Partner_Page partner_page = new Partner_Page();
    Result_Page_Age_Between_19_To_99 result_page_age_between_19_to_60 = new Result_Page_Age_Between_19_To_99();


// ***********************AGE UNDER 16 TO CHECK WALES TEST TICKET**********************

    @Given("^User on NHS cost checker tool$")
    public void user_on_NHS_cost_checker_tool() {

    }

    @When("^User click on start button$")
    public void user_click_on_start_button() {
        homePage.click_On_Start_Button();

    }

    @And("^User select country wales$")
    public void user_select_country_wales() {
        countryPage.click_On_Radio_Button();
    }

    @And("^Click on next$")
    public void click_on_next() {
        countryPage.click_On_Next_Button();


    }

    @And("^User type date of birth$")
    public void user_type_date_of_birth() {
        dateOfBirthPage.type_Date_Of_Birth();

    }

    @And("^User click on next$")
    public void user_click_on_next() {
        countryPage.click_On_Next_Button();








    }

    @Then("^User should be able to see free treatment message from NHS$")
    public void user_should_be_able_to_see_free_treatment_message_from_NHS() {
        resultUnder16Page.verify_Message();

    }

    //*******************AGE BETWEEN 17 TO 19 WALES TEST TICKET**********************

    @And("^User select yes full time Education$")
    public void userSelectYesFullTimeEducation() {

        education_page.click_On_Full_Time_Education();
    }

    @And("^Click on next tab$")
    public void clickOnNextTab() {

      countryPage.click_On_Next_Button();
    }

    @Then("^User should be able to see treatment message$")
    public void userShouldBeAbleToSeeTreatmentMessage() {
        result_page_age_between_17To19.verify_Full_Time_Eduction_Message();
    }

    //****************************AGE BETWEEN 19 T0 99********************************
    @And("^User select yes live with partner$")
    public void userSelectYesLiveWithPartner() {
        partner_page.click_On_Married();
        countryPage.click_On_Next_Button();

    }

    @And("^User select yes Do you or your partner claim any benefits or tax credits\\?$")
    public void userSelectYesDoYouOrYourPartnerClaimAnyBenefitsOrTaxCredits() {
        tax_credits_page.click_On_Tax_Credit();
        countryPage.click_On_Next_Button();

    }

    @And("^User select yes Do you or your partner get paid Universal Credit\\?$")
    public void userSelectYesDoYouOrYourPartnerGetPaidUniversalCredit() {
        universal_credit_page.click_on_Universal_Credit();
        countryPage.click_On_Next_Button();

    }

    @And("^User select yes As part of your or your parent's Universal Credit, do you have any of these\\?$")
    public void userSelectYesAsPartOfYourOrYourParentSUniversalCreditDoYouHaveAnyOfThese() {
        universal_credit_claim_page.click_On_Universal_Credit_Law();
        countryPage.click_On_Next_Button();

    }

    @And("^User select yes Was the take-home pay used in the last Universal Credit period Amount or less\\?$")
    public void userSelectYesWasTheTakeHomePayUsedInTheLastUniversalCreditPeriodAmountOrLess() {
        take_home_page.click_On_Yes_Home_Pay();


    }


    @And("^Click on next last tab$")
    public void clickOnNextLastTab() {

      countryPage.click_On_Next_Button();
    }

    @Then("^User should be able to see treatment message from NHS$")
    public void userShouldBeAbleToSeeTreatmentMessageFromNHS() {
        result_page_age_between_19_to_60.verify_User_age19To60_massage();
    }


}