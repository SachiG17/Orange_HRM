package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;


public class MyInfoPage{
    WebDriver driver;

    By input_firstName = By.xpath("//input[@name='firstName']");
    By input_middleName = By.xpath("//input[@name='middleName']");
    By input_lastName = By.xpath("//input[@name='lastName']");
    By nationality_drop = By.xpath("//div[contains(text(),'American')]");

    public MyInfoPage(WebDriver driver){
        this.driver = driver;
    }

    public void adddetails() {
        // Write code here that turns the phrase above into concrete actions
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
        WebElement firstName = wait.until(ExpectedConditions.visibilityOfElementLocated(input_firstName));
        firstName.sendKeys("Myfirstname");
        System.out.println("Added First Name");
        WebElement middleName = wait.until(ExpectedConditions.visibilityOfElementLocated(input_middleName));
        middleName.sendKeys("MymiddleName");
        System.out.println("Added Middle Name");
        WebElement lastName = wait.until(ExpectedConditions.visibilityOfElementLocated(input_lastName));
        lastName.sendKeys("MylastName");
        System.out.println("Added Last Name");
    }


}
