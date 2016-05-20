package com.jalasoft.testing.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.jalasoft.testing.utils.CommonFunctions.setComboboxField;
import static com.jalasoft.testing.utils.CommonFunctions.setTextField;
import static com.jalasoft.testing.utils.CommonFunctions.setCheckboxField;

/**
 * Created by Alex Alvarez on 5/17/2016.
 */
public class NewLeadForm extends AbstractBasePage{

    @FindBy(id = "name_salutationlea2")
    private WebElement salutationCombobox;

    @FindBy(id = "name_firstlea2")
    private WebElement firstNameTextField;

    @FindBy(name = "save")
    private WebElement saveButton;

    @FindBy(id = "name_lastlea2")
    private WebElement lastNameTextField;

    @FindBy (id = "lea3")
    private WebElement companyTextField;

    @FindBy (id = "lea4")
    private WebElement titleTextField;

    @FindBy(id = "lea5")
    private WebElement leadSourceCombobox;

    @FindBy(id = "lea6")
    private WebElement industryCombobox;

    @FindBy(id = "lea7")
    private WebElement annualRevenueTextField;

    @FindBy(id = "lea8")
    private WebElement phoneTextField;

    @FindBy(id = "lea9")
    private WebElement mobileTextField;

    @FindBy(id = "lea10")
    private WebElement faxTextField;

    @FindBy(id = "lea11")
    private WebElement emailTextField;

    @FindBy(id = "lea12")
    private WebElement websiteTextField;

    @FindBy(id = "lea13")
    private WebElement leadStatusComboBox;

    @FindBy(id = "lea14")
    private WebElement ratingComboBox;

    @FindBy(id = "lea15")
    private WebElement noOfEmployeesTextField;

    //Address Information section
    @FindBy(id = "lea16street")
    private WebElement streetTextField;

    @FindBy(id = "lea16city")
    private WebElement cityTextField;

    @FindBy(id = "lea16state")
    private WebElement stateProvinceTextField;

    @FindBy(id = "lea16zip")
    private WebElement zipPostalCodeTextField;

    @FindBy(id = "lea16country")
    private WebElement countryTextField;

    //Additional Information Section
    @FindBy(id = "00N3600000D6pzY")
    private WebElement productInterestCombobox;

    @FindBy(id = "00N3600000D6pzZ")
    private WebElement sICCodeTextField;

    @FindBy(id = "00N3600000D6pzW")
    private WebElement numberOfLocationsTextField;

    @FindBy(id = "00N3600000D6pzV")
    private WebElement currentGeneratorTextField;

    @FindBy(id = "00N3600000D6pzX")
    private WebElement primaryCombobox;

    //Description Information
    @FindBy(id = "lea17")
    private WebElement descriptionTextField;

    //Optional Section
    @FindBy(id = "lea21")
    private WebElement assignUsingActiveAssignmentRuleCheckbox;


    public LeadDetail clickSaveButton() {
        saveButton.click();
        return new LeadDetail();
    }


    public void setFirstNameTextField(String firstNameText) {
        setTextField(firstNameTextField, firstNameText, wait);
    }

    public void setLastNameTextField(String lastNameText) {
        setTextField(lastNameTextField, lastNameText, wait);
    }

    public void setCompanyTextField(String companyText) {
        setTextField(companyTextField, companyText, wait);
    }

    public void setTitleTextField(String titleText) {
        setTextField(titleTextField, titleText, wait);
    }

    public void setSalutationCombobox(String salutationText){
        setComboboxField(salutationCombobox, salutationText, wait);
    }

    public void setLeadSourceCombobox(String leadSourceText) {
        setComboboxField(leadSourceCombobox, leadSourceText, wait);
    }

    public void setIndustryCombobox(String industryText) {
        setComboboxField(industryCombobox, industryText, wait);
    }

    public void setAnnualRevenueTextField(String annualRevenueText) {
        setTextField(annualRevenueTextField, annualRevenueText, wait);
    }

    public void setPhoneTextField(String phoneText) {
        setTextField(phoneTextField, phoneText, wait);
    }

    public void setMobileTextField(String mobileText) {
        setTextField(mobileTextField, mobileText, wait);
    }

    public void setFaxTextField(String faxText) {
        setTextField(faxTextField, faxText, wait);
    }

    public void setEmailTextField(String emailText) {
        setTextField(emailTextField, emailText, wait);
    }

    public void setWebsiteTextField(String websiteText) {
        setTextField(websiteTextField, websiteText, wait);
    }

    public void setLeadStatusComboBox(String leadStatus) {
        setComboboxField(leadStatusComboBox, leadStatus, wait);
    }

    public void setRatingComboBox(String ratingText) {
        setComboboxField(ratingComboBox, ratingText, wait);
    }

    public void setNoOfEmployeesTextField(String noOfEmployeesText) {
        setTextField(noOfEmployeesTextField, noOfEmployeesText, wait);
    }

    public void setStreetTextField(String streetText) {
        setTextField(streetTextField, streetText, wait);
    }

    public void setCityTextField(String cityText) {
        setTextField(cityTextField, cityText, wait);
    }

    public void setStateProvinceTextField(String stateProvinceText) {
        setTextField(stateProvinceTextField, stateProvinceText, wait);
    }

    public void setZipPostalCodeTextField(String zipPostalCodeText) {
        setTextField(zipPostalCodeTextField, zipPostalCodeText, wait);
    }

    public void setCountryTextField(String countryText) {
        setTextField(countryTextField, countryText, wait);
    }

    public void setProductInterestCombobox(String productInterestText) {
        setComboboxField(productInterestCombobox, productInterestText, wait);
    }

    public void setSICCodeTextField(String SICCodeText) {
        setTextField(sICCodeTextField, SICCodeText, wait);
    }

    public void setNumberOfLocationsTextField(String numberOfLocationsText) {
        setTextField(numberOfLocationsTextField, numberOfLocationsText, wait);
    }

    public void setCurrentGeneratorTextField(String currentGeneratorText) {
        setTextField(currentGeneratorTextField, currentGeneratorText, wait);
    }

    public void setPrimaryCombobox(String primaryText) {
        setComboboxField(primaryCombobox, primaryText, wait);
    }

    public void setDescriptionTextField(String descriptionText) {
        setTextField(descriptionTextField, descriptionText, wait);
    }

    public void setAssignUsingActiveAssignmentRuleCheckbox(String expectedStatus) {
        setCheckboxField(assignUsingActiveAssignmentRuleCheckbox, expectedStatus, wait);
    }
}
