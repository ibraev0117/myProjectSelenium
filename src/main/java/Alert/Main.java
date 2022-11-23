package Alert;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup(); // we setup Chrome Driver

        WebDriver driver = new ChromeDriver();  // we choose Chrome browser

        driver.manage().window().maximize(); // we want to make browser full screen

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // wait 10 sec

        driver.get("https://demoqa.com/alerts");

        WebElement clickButton = driver.findElement(By.xpath("//button[@id='alertButton']"));
        clickButton.click();
         try {
             Thread.sleep(5000);
         }catch (Exception e){
             e.printStackTrace();
         }

        Alert alert = driver.switchTo().alert();
         alert.accept();

         WebElement timeAlertButton = driver.findElement(By.xpath("//button[@id='timerAlertButton']"));
         timeAlertButton.click();

         Thread.sleep(5000);

         Alert alert1 = driver.switchTo().alert();
         alert.accept();

         WebElement confirmButton = driver.findElement(By.xpath("//button[@id='confirmButton']"));
         confirmButton.click();

         Thread.sleep(3000);

         Alert alert2 = driver.switchTo().alert();
         alert2.dismiss();

         WebElement promtButton = driver.findElement(By.xpath("//button[@id='promtButton']"));
         promtButton.click();

         Thread.sleep(5000);

         Alert alert3 = driver.switchTo().alert();

         alert3.sendKeys("Hello World");
         alert3.accept();

         Thread.sleep(5000);

         driver.quit();








    }
}
