package org.testjava;
import Pages.LoginPage;
import Pages.PIMPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddEmployeeSteps {
    WebDriver driver = CommonMethods.getDriver();
    LoginPage login;
    PIMPage pimPage;

    @Given("Open the PIM page")
    public void open_the_pim_page() {
        //Opens the Login Page with valid creds and then open PIM page
        login = new LoginPage(driver);
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        login.ValidLoginMethods();
        driver.findElement(By.linkText("PIM")).click();
        System.out.println("Opened PIM Page");

    }
    @When("Enter the employee details")
    public void enter_the_employee_details() {
        // Write code here that turns the phrase above into concrete actions
        pimPage = new PIMPage(driver);
        pimPage.enter_userdetails();
        pimPage.AddEmployee();
        System.out.println("Added Employee");
    }
    @Then("Employee is added")
    public void employee_is_added() {
        // Write code here that turns the phrase above into concrete actions
        driver.close();

    }
}
