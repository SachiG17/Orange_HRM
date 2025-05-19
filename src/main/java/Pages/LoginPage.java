package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage  {

    WebDriver driver;
    By input_username = By.name("username");
    By input_password = By.name("password");
    By btn_login = By.tagName("button");

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    public void ValidLoginMethods(){
        driver.findElement(input_username).sendKeys("Admin");
        driver.findElement(input_password).sendKeys("admin123");
        driver.findElement(btn_login).click();
    }

}
