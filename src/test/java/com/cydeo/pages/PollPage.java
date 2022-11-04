package com.cydeo.pages;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class PollPage {

    public PollPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "(//span[.='Poll'])[1]")
    public WebElement pollButton;

    @FindBy(xpath ="//a[.='Add more']")
    public WebElement addMoreButton;


    @FindBy(xpath = "//a[@class='bx-finder-box-tab bx-lm-tab-department']")
    public WebElement EmployeesAndDepartments;


    @FindBy(xpath ="//a[@rel='U512']")
    public WebElement helpDesk22;


    @FindBy(xpath ="//div[.='hr76@cybertekschool.com']")
    public WebElement hr76;


    @FindBy(xpath ="//div[.='marketing4@cybertekschool.com']")
    public WebElement marketing4;

    @FindBy(xpath ="(//span[.='helpdesk22@cybertekschool.com'])[1]")
    public WebElement helpDeskInTheTo;


    @FindBy(xpath="//a[.='Add question']")
     public WebElement  addQuestionLink;

  @FindBy(name="UF_BLOG_POST_VOTE_n0_DATA[QUESTIONS][0][QUESTION]")
    public WebElement defaultQuestion0;



    @FindBy(xpath ="//label[@title='Delete question']")
    public List<WebElement> deleteQuestions;



    @FindBy(xpath = "//input[@id='multi_0']")
    public  WebElement allowMultipleChoiceBoxInput;

    @FindBy(xpath = "//label[@for='multi_0']")
    public  WebElement allowMultipleChoiceBoxLabel;


    @FindBy(xpath ="//span[@class='popup-window-close-icon']")
    public WebElement popupWindowCloseIcon;

    @FindBy(name="UF_BLOG_POST_VOTE_n0_DATA[QUESTIONS][0][ANSWERS][0][MESSAGE]")
    public WebElement firstDefaultAnswer;

    @FindBy(name="UF_BLOG_POST_VOTE_n0_DATA[QUESTIONS][0][ANSWERS][1][MESSAGE]")
    public WebElement secondDefaultAnswer;

   @FindBy(xpath ="//button[@id='blog-submit-button-save']")
    public WebElement sendButton;

    @FindBy(id="feed-add-post-form-notice-blockblogPostForm")
    public WebElement errorMessageVerification;


    @FindBy(className ="bx-editor-iframe")
    public WebElement iframeTitleMessagePlace;

    @FindBy(xpath ="//body[contains(@style,'min-height: 184px;')]")
    public WebElement titleMessagePlace;


    @FindBy(xpath ="//span[@class='feed-add-post-del-but']")
    public WebElement deleteAllEmployeesButton;





}



