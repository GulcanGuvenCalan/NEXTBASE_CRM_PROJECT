package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//input[@name='USER_LOGIN']")
    public WebElement usernameButton;

    @FindBy(xpath = "//input[@name='USER_PASSWORD']")
    public WebElement passwordButton;

    @FindBy(className = "login-btn")
    public WebElement loginButton;


    public void login(){
       this.usernameButton.sendKeys("helpdesk1@cybertekschool.com");
        this.passwordButton.sendKeys("UserUser");
        this.loginButton.click();
    }


}
