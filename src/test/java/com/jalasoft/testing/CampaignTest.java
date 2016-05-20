package com.jalasoft.testing;


import java.text.SimpleDateFormat;

import java.util.Date;




import com.jalasoft.testing.pages.*;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Alex Alvarez on 5/13/2016.
 */
public class CampaignTest {
    Date currentDate = new Date();
    String DATE_FORMAT = "M/dd/yyyy";
    SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT);



    String userName = "acrtson@gmail.com";
    String password = "Selenium123*";
    String expectedCampaignName = "New Campaign" + currentDate.getTime();


    private MainContainer login(String userName, String password){
        Login login = new Login();
        login.setUserNameTextField(userName);
        login.setPasswordTextField(password);
        return login.clickLoginButton();
    }

    @Test
    public void testCampaignName(){
        /*Login login = new Login();
        login.setUserNameTextField("acrtson@gmail.com");
        login.setPasswordTextField("Selenium123*");
        MainContainer mainContainer = login.clickLoginButton();*/
        MainContainer mainContainer = login(userName, password);

        TabBar tabBar = mainContainer.goToTabBar();
        CampaignHome campaignHome = tabBar.clickCampaignsTab();
        NewCampaignForm newCampaignForm = campaignHome.clickNewButton();
        newCampaignForm.setCampaignNameTextField(expectedCampaignName);
        CampaignDetail campaignDetail = newCampaignForm.clickSaveButton();

        Assert.assertEquals(campaignDetail.getCampaignName(), expectedCampaignName + " [View Hierarchy]");
    }

    @Test
    public void testCampaignStartDate(){
        String expectedCampaignStartDate = sdf.format(currentDate);

        MainContainer mainContainer = login(userName, password);

        TabBar tabBar = mainContainer.goToTabBar();
        CampaignHome campaignHome = tabBar.clickCampaignsTab();
        NewCampaignForm newCampaignForm = campaignHome.clickNewButton();
        newCampaignForm.setCampaignNameTextField(expectedCampaignName);
        newCampaignForm.setCampaignStarDateTextField(expectedCampaignStartDate);
        CampaignDetail campaignDetail = newCampaignForm.clickSaveButton();

        Assert.assertEquals(campaignDetail.getStartDate(), expectedCampaignStartDate);
    }

    @Test
    public void testPrivacyLink(){

    }
}
