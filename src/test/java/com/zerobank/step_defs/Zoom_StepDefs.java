package com.zerobank.step_defs;

import com.zerobank.pages.Zoomda;
import com.zerobank.utilities.utilities.BrowserUtils;
import com.zerobank.utilities.utilities.ConfigurationReader;
import com.zerobank.utilities.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Zoom_StepDefs {
    Zoomda zoomda = new Zoomda();

    @Given("User is on the ZOOM page")
    public void userIsOnTheLoginPage() {
        Driver.get().get(ConfigurationReader.get("url1"));
    }

    @Then("Kraft Technologie SDET Batch to click")
    public void kraft_technologie_sdet_batch_to_click() {
        zoomda.setChooseSdet();


    }

    @Then("Button to Rec to click")
    public void button_to_rec_to_click() {
        zoomda.setChooseRec();
    }

    @Then("Choose the course you want to watch and to click")
    public void choose_the_course_you_want_to_watch_and_to_click() {
        zoomda.setChooseLesson();
    }

    @When("User enters usernamed and passwordd")
    public void userEntersUsernamedAndPasswordd() {
        zoomda.enterUserName(ConfigurationReader.get("userName1"));
        zoomda.enterPassword(ConfigurationReader.get("passWord1"));
        zoomda.enterOturumAç();

    }


}