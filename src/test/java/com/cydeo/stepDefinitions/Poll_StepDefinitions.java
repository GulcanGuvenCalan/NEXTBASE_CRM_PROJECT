package com.cydeo.stepDefinitions;

import com.cydeo.pages.LoginPage;
import com.cydeo.pages.PollPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Poll_StepDefinitions {

    LoginPage loginPage = new LoginPage();
    PollPage pollPage = new PollPage();
    Faker faker = new Faker();

    @Given("user is already  logged in the homepage page")
    public void user_is_already_logged_in_the_homepage_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        loginPage.login();
    }

    @When("user clicks the poll button")
    public void user_clicks_the_poll_button() {
        BrowserUtils.clickWithJS(pollPage.pollButton);
        pollPage.pollButton.click();
    }

    @When("user clicks the add more button")
    public void user_clicks_the_add_more_button() {
        pollPage.addMoreButton.click();
    }

    @When("user clicks the Employees and Departments button")
    public void user_clicks_the_employees_and_departments_button() {
        pollPage.EmployeesAndDepartments.click();
    }

    @When("user clicks the helpdesk22@cybertekschool.com button")
    public void user_clicks_the_helpdesk22_cybertekschool_com_button() {
        BrowserUtils.clickWithJS(pollPage.helpDesk22);

    }

    @When("user clicks the hr76@cybertekschool.com button")
    public void user_clicks_the_hr76_cybertekschool_com_button() {
        pollPage.hr76.click();
    }

    @When("user clicks the marketing4@cybertekschool.com button")
    public void user_clicks_the_marketing4_cybertekschool_com_button() {
        pollPage.marketing4.click();
    }

    @Then("user should see {string}, {string} and {string} in the To container")
    public void user_should_see_and_in_the_to_container(String expectName, String string2, String string3) {

        String actualName = pollPage.helpDeskInTheTo.getText();
        Assert.assertEquals(expectName, actualName);
    }


    @When("user clicks the Add question link")
    public void user_clicks_the_add_question_link() {
        pollPage.addQuestionLink.click();
    }

    @When("user clicks the Add question link again")
    public void user_clicks_the_add_question_link_again() {
        pollPage.addQuestionLink.click();
    }

    @Then("user should see default question")
    public void user_should_see_default_question() {
        pollPage.defaultQuestion0.isDisplayed();
    }


    @Then("user deletes the questions and answers")
    public void user_deletes_the_questions_and_answers() {

        for (WebElement deleteQuestion : pollPage.deleteQuestions) {
            JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
            js.executeScript("arguments[0].click();", deleteQuestion);

            BrowserUtils.sleep(3);
        }
        }


    @When("user clicks the Allow multiple choice input")
    public void user_clicks_the_allow_multiple_choice_input() {
        BrowserUtils.sleep(3);
        pollPage.allowMultipleChoiceBoxInput.click();
    }
    @When("user should see The Allow multiple choice label")
    public void user_should_see_the_allow_multiple_choice_label() {
        pollPage.allowMultipleChoiceBoxLabel.isDisplayed();
    }



    @When("user click the popup-window-close-icon")
    public void user_click_the_popup_window_close_icon() {


        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].click();", pollPage.popupWindowCloseIcon);
    }
    @When("user types information in the default question")
    public void user_types_information_in_the_default_question() {

    pollPage.defaultQuestion0.sendKeys(faker.letterify("???????????????????"));
    }
    @When("user types information  in the first default answer")
    public void user_types_information_in_the_first_default_answer() {
    pollPage.firstDefaultAnswer.sendKeys(faker.letterify("????????????"));
    }
    @When("user types information  in the second default answer")
    public void user_types_information_in_the_second_default_answer() {
pollPage.secondDefaultAnswer.sendKeys(faker.letterify("???????"));
    }
    @When("user clicks send button")
    public void user_clicks_send_button() {
      BrowserUtils.waitFor(2);
    pollPage.sendButton.click();
    }
    @Then("user should see The message title is not specified error message")
    public void user_should_see_the_message_title_is_not_specified_error_message() {
        pollPage.errorMessageVerification.isDisplayed();
    }



    @When("user types information in the title")
    public void user_types_information_in_the_title() {

     Driver.getDriver().switchTo().frame(pollPage.iframeTitleMessagePlace);
      pollPage.titleMessagePlace.sendKeys(faker.letterify("??????????"));
 Driver.getDriver().switchTo().parentFrame();

    }
    @When("user clicks the delete All employees button")
    public void user_clicks_the_delete_all_employees_button() {
     pollPage.deleteAllEmployeesButton.click();
    }
    @Then("user should see Please specify at least one person. Error message")
    public void user_should_see_please_specify_at_least_one_person_error_message() {
        BrowserUtils.sleep(2);
       pollPage.errorMessageVerification.isDisplayed();
    }



    @Then("user should see   The question text is not specified. Error message")
    public void user_should_see_the_question_text_is_not_specified_error_message() {
        BrowserUtils.sleep(3);
       pollPage.errorMessageVerification.isDisplayed();
    }




    @When("user types {string}  in the default question")
    public void user_types_in_the_default_question(String string) {
     pollPage.defaultQuestion0.sendKeys("ABC");
    }
    @Then("user should see The question {string} has no answers. Error message")
    public void user_should_see_the_question_has_no_answers_error_message(String ABC) {
      pollPage.defaultQuestion0.isDisplayed();
    }



    @Then("user should see Please specify at least two answers. Error message")
    public void user_should_see_please_specify_at_least_two_answers_error_message() {
        String expectedErrorMessage= "Please specify at least two answers.";
        String actualErrorMessage=pollPage.errorMessageVerification.getText();
        Assert.assertEquals(expectedErrorMessage,actualErrorMessage);
    }


}


