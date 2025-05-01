package Tests;

import Pages.LoginPage;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest {
    private WebDriver driver;
    String baseUrl ="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
    LoginPage loginPage;

    @Epic("Login")
    @Feature("Valid Login")
    @Test(testName = "valid login with valid password and valid password" )
    public void validLogin(){
        loginPage = new LoginPage(driver);
        loginPage.loginHeaderIsVisible();
        loginPage.setUserName("Admin");
        loginPage.setPassword("admin123");
    }

    @BeforeMethod
    public void setUp(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(baseUrl);
    }

    @AfterMethod
    public void tearDown(){driver.quit();}

}
