package com.cydeo.step_definitions;

import com.cydeo.pages.WebTablePage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

import java.util.Map;

public class WebTable_StepDef {
    WebTablePage webTablePage = new WebTablePage();

    @Given("user is on the login pageof web table app")
    public void user_is_on_the_login_pageof_web_table_app() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
    }

    @When("user enters user name {string}")
    public void user_enters_user_name(String searchName) {

        webTablePage.username.sendKeys(searchName);

    }

    @When("user enter password {string}")
    public void user_enter_password(String searchPassword) {
        webTablePage.password.sendKeys(searchPassword);
    }

    @When("user clicks to login button")
    public void user_clicks_to_login_button() {
        webTablePage.loginButton.click();

    }

    @Then("user should see url contains orders")
    public void user_should_see_url_contains_orders() {

        Assert.assertTrue("URL Contains ORDER failed", Driver.getDriver().getCurrentUrl().contains("orders"));

    }


    @When("user enters username {string} password {string} and logins")
    public void userEntersUsernamePasswordAndLogins(String inputUsername, String inputPassword) {
      //  webTablePage.username.sendKeys(arg0);
      //  webTablePage.password.sendKeys(arg1);
      //  webTablePage.loginButton.click();
        webTablePage.login(inputUsername,inputPassword);

    }

    @When("user enters below credentials")
    public void userEntersBelowCredentials(Map<String,String> credentials) {
     //   webTablePage.username.sendKeys(credentials.get("inputUsername"));
     //   webTablePage.password.sendKeys(credentials.get("inputPassword"));
     //   webTablePage.loginButton.click();
        webTablePage.login(credentials.get("inputUsername"),credentials.get("inputPassword"));

    }
}
