package org.testjava;
import Pages.LoginPage;
import Pages.MyInfoPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class MyInfoSteps {
    WebDriver driver = CommonMethods.getDriver();
    LoginPage login;
    MyInfoPage infoPage;
    By save_btn = By.xpath("//div[@class='orangehrm-custom-fields']//button[@type='submit'][normalize-space()='Save']");
    By btn_myInfo = By.xpath("//span[text()='My Info']");


    @Given("Open the My Info Page")
    public void open_the_my_info_page() {
        // Write code here that turns the phrase above into concrete actions
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
        login = new LoginPage(driver);
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        login.ValidLoginMethods();
        System.out.println("Logged In Sucessfully");
        WebElement myInfoBtn = wait.until(ExpectedConditions.visibilityOfElementLocated(btn_myInfo));
        myInfoBtn.click();
        System.out.println("Clicked MyInfo Button");
    }

    @When("add new details")
    public void add_new_details() {
        // Write code here that turns the phrase above into concrete actions
        infoPage = new MyInfoPage(driver);
        infoPage.adddetails();
    }

    @Then("save changes")
    public void save_changes() {
        // Write code here that turns the phrase above into concrete actions
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement save = wait.until(ExpectedConditions.visibilityOfElementLocated(save_btn));
        System.out.println("Clicked Save");
        save.click();
    }

}
