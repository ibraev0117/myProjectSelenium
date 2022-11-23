package com.talentLms.UI.pages;

import com.talentLms.UI.helpers.Helper;
import com.talentLms.UI.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage{

    public  LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//input[@name'login']")
    public WebElement usernameOrEmailInput;

    @FindBy(xpath = "//input[@name'password']")
    public WebElement passwordInput;

    @FindBy(xpath = "//input[@name'submit']")
    public WebElement loginButton;

    Helper helper = new Helper();
    public LoginPage inputUserNameOrEmail(String userNameOrEmail){
        helper.sendKeys(usernameOrEmailInput,userNameOrEmail);
        return this;

    }

    public LoginPage inputPassword(String password){
        helper.sendKeys(passwordInput,password);
        return this;
    }
    public LoginPage clickLoginButton(){
        helper.click(loginButton);
        return this;
    }
}
