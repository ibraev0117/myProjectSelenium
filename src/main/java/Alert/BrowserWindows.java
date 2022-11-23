package Alert;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BrowserWindows {

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
        driver.get("https://demoqa.com/browser-windows");
    }

    @Test
    public void newTab(){

        String currentPage = driver.getWindowHandle();

        for (int i = 0; i < 5; i++) {
            WebElement newTab = driver.findElement(By.xpath("//button[@id='tabButton']"));
            newTab.click();
            try {
                Thread.sleep(3000);
            }catch (Exception e){
                e.printStackTrace();
            }

            driver.switchTo().window(currentPage);

            try {
                Thread.sleep(3000);
            }catch (Exception e){
                e.printStackTrace();
            }
//            List<String> pages = new LinkedList<>(driver.getWindowHandles());
//            driver.switchTo().window(pages.get(2));
//
//            try {
//                Thread.sleep(3000);
//            }catch (Exception e){
//                e.printStackTrace();
//            }

        }

    }


    @AfterEach

    public void afterEach(){
        System.out.println("");
    }

//    @AfterAll
//    public static void closeBrowser(){
//        driver.quit();
//    }
}
