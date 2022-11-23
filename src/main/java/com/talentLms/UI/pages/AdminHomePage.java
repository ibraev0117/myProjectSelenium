package com.talentLms.UI.pages;

import com.talentLms.UI.helpers.Helper;
import com.talentLms.UI.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminHomePage {
    public  AdminHomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//div[@class='tl-title tl-ellipsis']")
    public WebElement adminHomeTitle;


}
