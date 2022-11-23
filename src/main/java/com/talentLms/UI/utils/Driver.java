package com.talentLms.UI.utils;

import com.talentLms.UI.dataProvider.ConfigReader;
import org.openqa.selenium.WebDriver;

public class Driver {
    private Driver(){
        //Singleton pattern ---> одиночный патерн, так как privet
    }

    private static WebDriver driver;

    public static WebDriver getDriver(){
        if (driver == null){
             switch (ConfigReader.getProperty("browser").toLowerCase()){
                 case "chrome":
                     driver = ChromeWebDriver.loadChromeDriver();
                     break;
                 case "firefox":
                     driver = FireFoxWebDriver.loadFireFoxDriver();
                     break;
                 case "edge":
                     driver = EdgeWebDriver.loanEdgeDriver();
                     break;
                 default:
                     driver = ChromeWebDriver.loadChromeDriver();
             }
        }
        return driver;
    }

    public static void closeDriver(){

    }
}
