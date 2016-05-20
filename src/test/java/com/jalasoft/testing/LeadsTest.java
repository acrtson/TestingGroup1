package com.jalasoft.testing;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.jalasoft.testing.pages.*;

import static org.testng.Assert.assertEquals;

/**
 * Created by Alex Alvarez on 5/17/2016.
 */
public class LeadsTest {
    public static final String EMPTY_SPACE = " ";

    private final String expectedLastName = "Testing Last Name";
    private StringBuilder expectedName = new StringBuilder();

    private MainContainer mainContainer;

    private LeadHome leadHome;

    private NewLeadForm newLeadForm;

    @BeforeClass
    public void setUp(){
        String userName = "acrtson@gmail.com";
        String password = "Selenium123*";

        Login login = new Login();
        login.setUserNameTextField(userName);
        login.setPasswordTextField(password);
        mainContainer = login.clickLoginButton();
    }

    @BeforeMethod
    public void beforeMethod(){
        String expectedCompany = "Testing Company Name";

        TabBar tabBar = mainContainer.goToTabBar();
        leadHome = tabBar.clickLeadsTab();
        newLeadForm = leadHome.clickNewButton();
        newLeadForm.setLastNameTextField(expectedLastName);
        newLeadForm.setCompanyTextField(expectedCompany);
    }

    @Test
    public void testName() {
        String expectedSalutation = "Prof.";
        String expectedFirstName = "Testing First Name";

        expectedName.append(expectedSalutation);
        expectedName.append(EMPTY_SPACE);
        expectedName.append(expectedFirstName);
        expectedName.append(EMPTY_SPACE);
        expectedName.append(expectedLastName);

        newLeadForm.setSalutationCombobox(expectedSalutation);
        newLeadForm.setFirstNameTextField(expectedFirstName);
        LeadDetail leadDetail = newLeadForm.clickSaveButton();

        assertEquals(leadDetail.getName(), expectedName.toString());
    }

    @Test
    public void testTitle(){
        String expectedTitle = "Testing Title";

        newLeadForm.setTitleTextField(expectedTitle);
        LeadDetail leadDetail = newLeadForm.clickSaveButton();

        assertEquals(leadDetail.getTitle(), expectedTitle);
    }

    @Test
    public void testLeadSource(){
        String expectedLeadSource = "Partner Referral";

        newLeadForm.setLeadSourceCombobox(expectedLeadSource);
        LeadDetail leadDetail = newLeadForm.clickSaveButton();

        assertEquals(leadDetail.getLeadSource(), expectedLeadSource);
    }

    @Test
    public void testIndustry(){
        String expectedIndustry = "Telecommunications";

        newLeadForm.setIndustryCombobox(expectedIndustry);
        LeadDetail leadDetail = newLeadForm.clickSaveButton();

        assertEquals(leadDetail.getIndustry(), expectedIndustry);
    }

    @Test
    public void testAnnualRevenue(){
        String expectedAnnualRevenue = "999";

        newLeadForm.setAnnualRevenueTextField(expectedAnnualRevenue);
        LeadDetail leadDetail = newLeadForm.clickSaveButton();

        assertEquals(leadDetail.getAnnualRevenue(), "$" + expectedAnnualRevenue);
    }

    @Test
    public void testPhone(){
        String expectedPhone = "+591 (4) 4123456";

        newLeadForm.setPhoneTextField(expectedPhone);
        LeadDetail leadDetail = newLeadForm.clickSaveButton();

        assertEquals(leadDetail.getPhone(), expectedPhone);
    }

    @Test
    public void testMobile(){
        String expectedMobile = "+591 (7) 123-4567";

        newLeadForm.setMobileTextField(expectedMobile);
        LeadDetail leadDetail = newLeadForm.clickSaveButton();

        assertEquals(leadDetail.getMobile(), expectedMobile);
    }

    @Test
    public void testFax(){
        String expectedFax = "+591 (4) 4654321";

        newLeadForm.setFaxTextField(expectedFax);
        LeadDetail leadDetail = newLeadForm.clickSaveButton();

        assertEquals(leadDetail.getFax(), expectedFax);
    }

    @Test
    public void testEmail(){
        String expectedEmail = "testing@test.com";

        newLeadForm.setEmailTextField(expectedEmail);
        LeadDetail leadDetail = newLeadForm.clickSaveButton();

        assertEquals(leadDetail.getEmail(), expectedEmail);
    }

    @Test
    public void testWebsite(){
        String expectedWebsite = "http://test.com";

        newLeadForm.setWebsiteTextField(expectedWebsite);
        LeadDetail leadDetail = newLeadForm.clickSaveButton();

        assertEquals(leadDetail.getWebsite(), expectedWebsite);
    }

    @Test
    public void testLeadStatus(){
        String expectedLeadStatus = "Working - Contacted";

        newLeadForm.setLeadStatusComboBox(expectedLeadStatus);
        LeadDetail leadDetail = newLeadForm.clickSaveButton();

        assertEquals(leadDetail.getLeadStatus(), expectedLeadStatus);
    }

    @Test
    public void testRating(){
        String expectedRating = "Cold";

        newLeadForm.setRatingComboBox(expectedRating);
        LeadDetail leadDetail = newLeadForm.clickSaveButton();

        assertEquals(leadDetail.getRating(), expectedRating);
    }

    @Test
    public void testNoOfEmployees(){
        String expectedNoOfEmployees = "123";

        newLeadForm.setNoOfEmployeesTextField(expectedNoOfEmployees);
        LeadDetail leadDetail = newLeadForm.clickSaveButton();

        assertEquals(leadDetail.getNoOfEmployees(), expectedNoOfEmployees);
    }

    @Test
    public void testStreet(){
        String expectedStreet = "This is the data for a street for the text area";

        newLeadForm.setStreetTextField(expectedStreet);
        LeadDetail leadDetail = newLeadForm.clickSaveButton();

        assertEquals(leadDetail.getAddress(), expectedStreet);
    }

    @Test
    public void testCity(){
        String expectedCity = "City expected text";

        newLeadForm.setCityTextField(expectedCity);
        LeadDetail leadDetail = newLeadForm.clickSaveButton();

        assertEquals(leadDetail.getAddress(), expectedCity);
    }

    @Test
    public void testStateProvince(){
        String expectedStateProvince = "State Province expected text";

        newLeadForm.setStateProvinceTextField(expectedStateProvince);
        LeadDetail leadDetail = newLeadForm.clickSaveButton();

        assertEquals(leadDetail.getAddress(), expectedStateProvince);
    }

    @Test
    public void testZipPostalCode(){
        String expectedZipPostalCode = "123456789";

        newLeadForm.setZipPostalCodeTextField(expectedZipPostalCode);
        LeadDetail leadDetail = newLeadForm.clickSaveButton();

        assertEquals(leadDetail.getAddress(), expectedZipPostalCode);
    }

    @Test
    public void testCountry(){
        String expectedCountry = "Country expected text";

        newLeadForm.setCountryTextField(expectedCountry);
        LeadDetail leadDetail = newLeadForm.clickSaveButton();

        assertEquals(leadDetail.getAddress(), expectedCountry);
    }

    @Test
    public void testProductInterest(){
        String expectedProductInterest = "GC5000 series";

        newLeadForm.setProductInterestCombobox(expectedProductInterest);
        LeadDetail leadDetail = newLeadForm.clickSaveButton();

        assertEquals(leadDetail.getProductInterest(), expectedProductInterest);
    }

    @Test
    public void testSICCode(){
        String expectedSICCode = "Expected SICCod";

        newLeadForm.setSICCodeTextField(expectedSICCode);
        LeadDetail leadDetail = newLeadForm.clickSaveButton();

        assertEquals(leadDetail.getSICCode(), expectedSICCode);
    }

    @Test
    public void testNumberOfLocations(){
        String expectedNumberOfLocations = "15";

        newLeadForm.setNumberOfLocationsTextField(expectedNumberOfLocations);
        LeadDetail leadDetail = newLeadForm.clickSaveButton();

        assertEquals(leadDetail.getNumberOfLocations(), expectedNumberOfLocations);
    }

    @Test
    public void testCurrentGenerator(){
        String expectedCurrentGenerator = "15";

        newLeadForm.setCurrentGeneratorTextField(expectedCurrentGenerator);
        LeadDetail leadDetail = newLeadForm.clickSaveButton();

        assertEquals(leadDetail.getCurrentGenerator(), expectedCurrentGenerator);
    }

    @Test
    public void testPrimary(){
        String expectedPrimary = "Yes";

        newLeadForm.setPrimaryCombobox(expectedPrimary);
        LeadDetail leadDetail = newLeadForm.clickSaveButton();

        assertEquals(leadDetail.getPrimary(), expectedPrimary);
    }

    @Test
    public void testDescription(){
        String expectedDescription = "This is the expected description for Description textArea";

        newLeadForm.setDescriptionTextField(expectedDescription);
        LeadDetail leadDetail = newLeadForm.clickSaveButton();

        assertEquals(leadDetail.getDescription(), expectedDescription);
    }

    @Test
    public void testAssignUsingActiveAssignmentRule(){
        String expectedAssignUsingActiveAssignmentRule = "Yes";

        newLeadForm.setAssignUsingActiveAssignmentRuleCheckbox(expectedAssignUsingActiveAssignmentRule);
        LeadDetail leadDetail = newLeadForm.clickSaveButton();

        //assertEquals(leadDetail.getAssignUsingActiveAssignmentRule(), expectedAssignUsingActiveAssignmentRule);
    }

    @Test
    public void testCampaign(){
        String expectedCampaign = "NewCompaigname1462928429297";
    }


    @Test
    public void testPrivacyLink(){
        Footer footer = mainContainer.goToFooter();
        Privacy privacy = footer.clickPrivacyLink();

        assertEquals(privacy.getTitleText(), "Privacy Statements");

        privacy.switchMainWindow();
    }
}
