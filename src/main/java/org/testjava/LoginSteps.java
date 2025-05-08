package org.testjava;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class LoginSteps {

    WebDriver driver = null;

    @Given("Browser is Opened")
    public void browser_is_opened() {
        // Write code here that turns the phrase above into concrete actions
        System.setProperty("webdriver.edge.driver","src/test/resources/drivers/msedgedriver.exe");
        driver = new EdgeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.w

    }
    @And("User is on LogIn Page")
    public void user_is_on_log_in_page() {
        // Write code here that turns the phrase above into concrete actions
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }
    @When("User enters username and password")
    public void user_enters_username_and_password() {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin123");
        driver.findElement(By.tagName("button")).click();
    }
    @Then("User is navigated to Home Page")
    public void user_is_navigated_to_home_page() {
        // Write code here that turns the phrase above into concrete actions
        String ActualTitle = driver.findElement(By.tagName("h6")).getText();
        String ExpectedTitle = "Dashboard";
        Assert.assertEquals(ExpectedTitle,ActualTitle);
        driver.close();


    }


}
