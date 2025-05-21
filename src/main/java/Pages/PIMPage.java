package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class PIMPage {
    WebDriver driver;
    PIMPage pimPage;

    By btn_AddEmployee = By.linkText("Add Employee");
    By input_firstname = By.name("firstName");
    By input_middlename = By.name("middleName");
    By input_lastname = By.name("lastName");
    By input_empid = By.className("oxd-input");
    By btn_save = By.xpath("//button[text()=' Save ']");

    public PIMPage(WebDriver driver){
        this.driver = driver;
    }
    public void enter_userdetails(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement addEmployeeBtn = wait.until(ExpectedConditions.visibilityOfElementLocated(btn_AddEmployee));
        addEmployeeBtn.click();
        WebElement firstNameInput = wait.until(ExpectedConditions.visibilityOfElementLocated(input_firstname));
        firstNameInput.sendKeys("Testfirstnm");
        WebElement middleNameInput = wait.until((ExpectedConditions.visibilityOfElementLocated(input_middlename)));
        middleNameInput.sendKeys("Testmiddlenm");
        WebElement lastNameInput = wait.until(ExpectedConditions.visibilityOfElementLocated(input_lastname));
        lastNameInput.sendKeys("Testlastnm");
        driver.findElement(input_empid).sendKeys("123568");
    }

    public void AddEmployee(){
        driver.findElement(btn_save).click();
    }
}
