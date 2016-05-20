package com.jalasoft.testing.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * Created by Alex Alvarez on 5/16/2016.
 */
public class TabBar extends AbstractBasePage{

    @FindBy(css = "#Campaign_Tab > a")
    private WebElement campaignTab;

    @FindBy(css = "#Lead_Tab > a")
    private WebElement leadsTab;

    public CampaignHome clickCampaignsTab(){
        wait.until(ExpectedConditions.elementToBeClickable(campaignTab));
        campaignTab.click();
        return new CampaignHome();
    }

    public LeadHome clickLeadsTab() {
        wait.until(ExpectedConditions.elementToBeClickable(leadsTab));
        leadsTab.click();
        return new LeadHome();
    }
}
