package SeleniumElements;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class SeleniumStudentRegistration {

    @Test
    public void studentRegistration() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://demoqa.com/automation-practice-form");

        WebElement nameInputField = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
        nameInputField.sendKeys("Aybek");

        WebElement lastNameInputField = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
        lastNameInputField.sendKeys("Ibraev");
        Thread.sleep(3000);

        WebElement emailInputField = driver.findElement(By.xpath("//input[@placeholder='name@example.com']"));
        emailInputField.sendKeys("Ibraev0117@gmail.com");

        WebElement genderButton = driver.findElement(By.xpath("(//label[@class='custom-control-label'])[1]"));
        genderButton.click();

        WebElement mobileNumber = driver.findElement(By.xpath("//input[@placeholder='Mobile Number']"));
        mobileNumber.sendKeys("705732370");

        Thread.sleep(3000);

        WebElement dateOfBirth = driver.findElement(By.xpath("//input[@id='dateOfBirthInput']"));
        dateOfBirth.click();

        WebElement monthButton = driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']"));
        monthButton.click();
        monthButton.sendKeys("ja", Keys.ENTER);

        Thread.sleep(3000);

        WebElement yearsButton = driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']"));
        yearsButton.click();
        yearsButton.sendKeys("1995", Keys.ENTER);


        WebElement dayButton = driver.findElement(By.xpath("//div[@aria-label='Choose Tuesday, January 17th, 1995']"));
        dayButton.click();



        WebElement subjectInputField = driver.findElement(By.xpath("//input[@id='subjectsInput']"));
        subjectInputField.sendKeys("Math");
        subjectInputField.sendKeys(Keys.ENTER);

        WebElement hobbiesButton = driver.findElement(By.xpath("(//label[@class='custom-control-label'])[4]"));
        hobbiesButton.click();

        WebElement chooseFile = driver.findElement(By.xpath("//input[@id='uploadPicture']"));
        chooseFile.sendKeys("C:\\Users\\User\\Desktop\\pass.jpg");

        WebElement currentAddress = driver.findElement(By.xpath("//textarea[@placeholder='Current Address']"));
        currentAddress.sendKeys("Karakol");

        Thread.sleep(3000);
        driver.quit();


    }
}
