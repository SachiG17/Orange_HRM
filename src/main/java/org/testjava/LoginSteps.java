package org.testjava;

import Pages.LoginPage;
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

    //Webdriver initiated
    WebDriver driver = CommonMethods.getDriver();
    LoginPage loginPage;

    //Opening the Browser
    @Given("User is on LogIn Page")
    public void user_is_on_log_in_page() {
        // Write code here that turns the phrase above into concrete actions
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    @When("User enters username and password")
    public void user_enters_username_and_password() {
        // Write code here that turns the phrase above into concrete actions
        loginPage = new LoginPage(driver);
        loginPage.ValidLoginMethods();
    }

    @Then("User is navigated to Home Page")
    public void user_is_navigated_to_home_page() {
        // Write code here that turns the phrase above into concrete actions
        String ActualTitle = driver.findElement(By.tagName("h6")).getText();
        String ExpectedTitle = "Dashboard";
        Assert.assertEquals(ExpectedTitle,ActualTitle);

    }


}
