package Alert;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DemoAlert {

    static WebDriver driver;

    @BeforeAll

    public static void chromeSetup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @BeforeEach
    public void setup(){
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://demoqa.com/alerts");
    }

    @Test
    public void clickMe() throws InterruptedException {
        WebElement clickMeButton = driver.findElement(By.xpath("//button[@id='alertButton']"));
        clickMeButton.click();

        Alert alert = driver.switchTo().alert();
        alert.accept();

        Thread.sleep(3000);

    }

    @Test
    public void timerAlert() throws InterruptedException {
        WebElement timerAlertButton = driver.findElement(By.xpath("//button[@id='timerAlertButton']"));
        timerAlertButton.click();

        try {
            Thread.sleep(5000);
        }catch (Exception e){
            e.printStackTrace();
        }

        Alert alert = driver.switchTo().alert();
        alert.accept();

        Thread.sleep(5000);
    }

    @Test
    public void confirmButton() throws InterruptedException {
        WebElement confirmButton = driver.findElement(By.xpath("//button[@id='confirmButton']"));
        confirmButton.click();

        Alert alert = driver.switchTo().alert();
        alert.dismiss();

        Thread.sleep(5000);
    }



    @AfterEach

    public void afterEach(){
        System.out.println("");
    }

    @AfterAll
    public static void closeBrowser(){
        driver.quit();
    }
}
