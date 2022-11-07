package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Map;

public class WebTablePage {
    public WebTablePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@name='username']")
    public WebElement username;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement password;

    @FindBy(xpath = "//button[@type='submit']")
    public  WebElement loginButton;

    /**
     * This method will accept username and password and login to app
     * @param inputUsername
     * @param inputPassword
     */

    public void login(String inputUsername,String inputPassword){
        username.sendKeys(inputUsername);
        password.sendKeys(inputPassword);
        loginButton.click();
    }



}
