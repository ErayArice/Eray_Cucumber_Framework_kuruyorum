package com.zerobank.pages;

import com.zerobank.utilities.utilities.BrowserUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import com.zerobank.utilities.utilities.Driver;


public class Zoomda extends BasePage {


    @FindBy(xpath = "//div[@class='ic-DashboardCard__header_hero'][1]")
    public WebElement chooseSdet;

    @FindBy(xpath = "//img[@src='https://canvas.instructure.com/courses/5558360/files/194132045/preview']")
    public WebElement chooseRec;



    @FindBy(xpath = "(//table/tbody/tr)[2]//a")
    public WebElement chooseLesson;
    @FindBy(xpath = "//input[@class='ic-Input text'][@name='pseudonym_session[unique_id]']")
    public WebElement getUserNameBox;

    @FindBy(css = "#pseudonym_session_password")
    public WebElement getUserPasswordBox;

    @FindBy(xpath = "//button[@class='Button Button--login'][1]")
    public WebElement oturumAç;

    public void setChooseLesson() {
        chooseLesson.click();
    }

    public void setChooseSdet() {

        chooseSdet.click();
        BrowserUtils.waitFor(2);

    }


    public void setChooseRec() {

        BrowserUtils.waitFor(2);
    }


    public void enterUserName(String str) {
        BrowserUtils.sendKeys(getUserNameBox, str);
    }

    public void enterPassword(String str) {
        BrowserUtils.sendKeys(getUserPasswordBox, str);
    }

    public void enterOturumAç() {
        BrowserUtils.waitFor(1);
        BrowserUtils.clickWithJS(oturumAç);
        // oturumAç.click();
    }
}