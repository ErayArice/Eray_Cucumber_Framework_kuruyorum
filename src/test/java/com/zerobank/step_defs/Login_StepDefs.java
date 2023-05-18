package com.zerobank.step_defs;

import com.zerobank.pages.LoginPage;
import com.zerobank.pages.Zoomda;
import com.zerobank.utilities.utilities.ConfigurationReader;
import com.zerobank.utilities.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Login_StepDefs {

    LoginPage loginPage = new LoginPage();

    @Given("User is on the login page")
    public void userIsOnTheLoginPage() {
        Driver.get().get(ConfigurationReader.get("url"));

    }

    @When("User taps on sign in button")
    public void userTapsOnSignInButton() {
        loginPage.clickSignInButtonHome();

    }

    @When("User enters {string} and {string}")
    public void userEntersAnd(String arg0, String arg1) {
        loginPage.credentialGet(arg0, arg1);

    }

    @When("User taps on sign is button to login")
    public void userTapsOnSignIsButtonToLogin() {
        loginPage.clickSignInEntry();

    }

    @When("User taps on back button")
    public void userTapsOnBackButton() {
        Driver.get().navigate().back();

    }

    @Then("Validate that username is visible on the board")
    public void validateThatUsernameIsVisibleOnTheBoard() {
        String expected="username";
        String actual=loginPage.setTitleCheck();
        Assert.assertEquals(expected,actual);


    }




}
