package com.cydeo.stepDefinitions;


import com.cydeo.pages.LoginPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;

import java.util.concurrent.TimeUnit;

public class Login_StepDefinitions {

    LoginPage loginPage=new LoginPage();


    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
    Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    Driver.getDriver().manage().window().maximize();
    Driver.getDriver().manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

    }

    @When("user enters {string} in the username input box")
    public void user_enters_in_the_login_input_box(String string) {

        loginPage.usernameButton.sendKeys("username");
    }

    @And("user enters  {string} in the password input box")
    public void user_enters_in_the_password_input_box(String string) {
       loginPage.passwordButton.sendKeys("password");

    }
    @Then("user clicks the Log In  button")
    public void user_clicks_the_log_in_button() {
        Driver.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
   loginPage.loginButton.click();


    }
    }




