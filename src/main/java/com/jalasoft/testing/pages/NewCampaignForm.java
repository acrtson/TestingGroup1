package com.jalasoft.testing.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * Created by Alex Alvarez on 5/16/2016.
 */
public class NewCampaignForm extends AbstractBasePage{

    @FindBy(id = "cpn1")
    private WebElement campaignNameTextField;

    @FindBy(id = "cpn5")
    private WebElement startDateTextField;

    @FindBy(name = "save")
    private WebElement saveButton;

    public void setCampaignNameTextField(String campaignName) {
        wait.until(ExpectedConditions.visibilityOf(campaignNameTextField));
        campaignNameTextField.clear();
        campaignNameTextField.sendKeys(campaignName);
    }

    public void setCampaignStarDateTextField(String startDate){
        wait.until(ExpectedConditions.visibilityOf(startDateTextField));
        startDateTextField.clear();
        startDateTextField.sendKeys(startDate);
    }

    public CampaignDetail clickSaveButton() {
        saveButton.click();
        return new CampaignDetail();
    }
}
