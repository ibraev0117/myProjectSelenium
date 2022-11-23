package SeleniumElements;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class SeleniumDemo {

    String name = "Ibraev Aybek";
    String email = "Ibraev0117@gmail.com";
    String currentAddress = "Karakol";
    String permanentAddress = "Bishkek";

    @Test

    public void test1() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://demoqa.com/text-box");

        WebElement fullName = driver.findElement(By.xpath("//input[@id='userName']"));
        fullName.sendKeys(name);

        try {
            Thread.sleep(4000);
        }catch (Exception e){
            e.printStackTrace();
        }
        WebElement emailG = driver.findElement(By.xpath("//input[@id='userEmail']"));
        emailG.sendKeys(email);
        Thread.sleep(2000);

        WebElement currentAddressInput = driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
        currentAddressInput.sendKeys(currentAddress);
        Thread.sleep(2000);

        WebElement permanentAddressInput = driver.findElement(By.xpath("//textarea[@id='permanentAddress']"));
        permanentAddressInput.sendKeys(permanentAddress);
        Thread.sleep(2000);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("windows.scrollBy(0,250)","");

        WebElement submitButton = driver.findElement(By.xpath("//button[@id='submit']"));
        submitButton.click();
        Thread.sleep(3000);

        WebElement actualName = driver.findElement(By.xpath("//p[@id='name']"));

        Assertions.assertEquals(name,actualName.getText().substring(5));











    }
}
