package com.jalasoft.testing.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Alex Alvarez on 5/17/2016.
 */
public class LeadDetail extends AbstractBasePage{

    @FindBy(id = "lea2_ileinner")
    private WebElement firstNameText;

    @FindBy(id = "lea4_ileinner")
    private WebElement titleText;

    @FindBy (id = "lea5_ileinner")
    private WebElement leadSourceText;

    @FindBy(id = "lea6_ileinner")
    private WebElement industryText;

    @FindBy(id = "lea7_ileinner")
    private WebElement annualRevenueText;

    @FindBy(id = "lea8_ileinner")
    private WebElement phoneText;

    @FindBy(id = "lea9_ileinner")
    private WebElement mobileText;

    @FindBy(id = "lea10_ileinner")
    private WebElement faxText;

    @FindBy(id = "lea11_ileinner")
    private WebElement emailText;

    @FindBy(id = "lea12_ileinner")
    private WebElement websiteText;

    @FindBy(id = "lea13_ileinner")
    private WebElement leadStatusText;

    @FindBy(id = "lea14_ileinner")
    private WebElement ratingText;

    @FindBy(id = "lea15_ileinner")
    private WebElement noOfEmployeesText;

    //Address Information section
    @FindBy(id = "lea16_ileinner")
    private WebElement addressText;

    //Additional Information Section
    @FindBy(id = "00N3600000D6pzY_ileinner")
    private WebElement productInterestText;

    @FindBy(id = "00N3600000D6pzZ_ileinner")
    private WebElement sICCodeText;

    @FindBy(id = "00N3600000D6pzW_ileinner")
    private WebElement numberOfLocationsText;

    @FindBy(id = "00N3600000D6pzV_ileinner")
    private WebElement currentGeneratorText;

    @FindBy(id = "00N3600000D6pzX_ileinner")
    private WebElement primaryText;

    @FindBy(id = "00N3600000D6pzX_ileinner")
    private WebElement descriptionText;

    public String getName() {
        return firstNameText.getText();
    }

    public String getTitle() {
        return titleText.getText();
    }

    public String getLeadSource() {
        return leadSourceText.getText();
    }

    public String getIndustry() {
        return industryText.getText();
    }

    public String getAnnualRevenue() {
        return annualRevenueText.getText();
    }

    public String getPhone() {
        return phoneText.getText();
    }

    public String getMobile() {
        return mobileText.getText();
    }

    public String getFax() {
        return faxText.getText();
    }

    public String getEmail() {
        return emailText.getText();
    }

    public String getWebsite() {
        return websiteText.getText();
    }

    public String getLeadStatus() {
        return leadStatusText.getText();
    }

    public String getRating() {
        return ratingText.getText();
    }

    public String getNoOfEmployees() {
        return noOfEmployeesText.getText();
    }

    public String getAddress(){
        return addressText.getText();
    }

    public String getProductInterest() {
        return productInterestText.getText();
    }

    public String getSICCode() {
        return sICCodeText.getText();
    }

    public String getNumberOfLocations() {
        return numberOfLocationsText.getText();
    }

    public String getCurrentGenerator() {
        return currentGeneratorText.getText();
    }

    public String getPrimary() {
        return primaryText.getText();
    }

    public String getDescription() {
        return descriptionText.getText();
    }

    /*public String getAssignUsingActiveAssignmentRule() {
        return assignUsingActiveAssignmentRule;
    }*/
}
