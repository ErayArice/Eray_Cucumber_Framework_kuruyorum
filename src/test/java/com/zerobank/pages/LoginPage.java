package com.zerobank.pages;

import com.zerobank.utilities.utilities.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {


    @FindBy(xpath = "//button[@id='signin_button']")
    public WebElement signInButton;

    @FindBy(xpath = "//input[@id='user_login']")
    public WebElement userNameBox;

    @FindBy(xpath = "//input[@id='user_password']")
    public WebElement userPasswordBox;

    @FindBy(xpath = "//input[@type='submit']")
    public WebElement clickSignIn;

    @FindBy(xpath = "//i[@class='icon-user']/..")
    public WebElement titleCheck;




    public void clickSignInButtonHome() {
        BrowserUtils.clickWithJS(signInButton);
    }

    public void credentialGet(String str,String str2){
        BrowserUtils.sendKeys(userNameBox,str);
        BrowserUtils.sendKeys(userPasswordBox,str2);
    }

    public void clickSignInEntry(){
        BrowserUtils.clickWithJS(clickSignIn);

    }
    public String setTitleCheck(){
       return titleCheck.getText();

    }

}

