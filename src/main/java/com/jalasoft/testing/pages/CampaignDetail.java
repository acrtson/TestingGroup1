package com.jalasoft.testing.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Alex Alvarez on 5/16/2016.
 */
public class CampaignDetail extends AbstractBasePage {

    @FindBy (id = "cpn1_ileinner")
    private WebElement campaignText;

    @FindBy(id = "cpn5_ileinner")
    private WebElement startDateText;


    public String getCampaignName() {
        return campaignText.getText();
    }

    public String getStartDate() {
        return startDateText.getText();
    }
}
