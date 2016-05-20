package com.jalasoft.testing.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static com.jalasoft.testing.utils.CommonFunctions.setTextField;

/**
 * Created by Alex Alvarez on 5/13/2016.
 */
public class Login extends AbstractBasePage{

    public static final String urlBase = "https://login.salesforce.com";
    @FindBy(id = "username")
    private WebElement userNameTextField;

    @FindBy(id = "password")
    private WebElement passwordTextField;

    @FindBy(id = "Login")
    private WebElement loginButton;

    public Login() {
        driver.get(urlBase);
    }

    public void setUserNameTextField(String username){
        setTextField(userNameTextField, username, wait);
    }

    public void setPasswordTextField(String password){
        setTextField(passwordTextField, password, wait);
    }

    public MainContainer clickLoginButton(){
        wait.until(ExpectedConditions.elementToBeClickable(loginButton));
        loginButton.click();
        return new MainContainer();
    }

    public MainContainer loginAs(String userName, String password){
        setUserNameTextField(userName);
        setPasswordTextField(password);
        return clickLoginButton();
    }
}
