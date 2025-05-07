package Pages;

import Bots.Bot;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {
    private WebDriver driver;
    public LoginPage(WebDriver driver){this.driver=driver;}

    //// Locators ////

    private final By loginHeader          = By.xpath("//h5[contains(@class , 'orangehrm-login-title')]");
    private final By userName             = By.xpath("//input[@name = 'username']");
    private final By password             = By.xpath("//input[@name = 'password']");
    private final By loginButton          = By.xpath("//button[@type = 'submit']");
    private final By forgetYourPassword   = By.xpath("//p[contains(@class , 'orangehrm-login-forgot-header')]");
    private final By dashboard            = By.xpath("//h6[text()='Dashboard']");


    //// Methods ////

    public void loginHeaderIsVisible(){
        Bot.isVisible(driver,loginHeader);
    }

    public void setUserName(String userName1){
        Bot.enterText(driver,userName,userName1);
    }

    public void setPassword(String password1){
        Bot.enterText(driver,password,password1);
    }

    public void clickLogin(){
        Bot.clicking(driver,loginButton);
    }

    public void compeleteLogin(String userName1,String password1){
        Bot.isVisible(driver,loginHeader);
        Bot.enterText(driver,userName,userName1);
        Bot.enterText(driver,password,password1);
        Bot.clicking(driver,loginButton);

    }

    public String compeleteLoginWithOrangehrmCookieReturned(String userName1,String password1){

        WebDriver driver;
        String baseUrl ="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
        driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(baseUrl);

        Bot.isVisible(driver,loginHeader);
        Bot.enterText(driver,userName,userName1);
        Bot.enterText(driver,password,password1);
        Bot.clicking(driver,loginButton);
        Bot.isVisible(driver,dashboard);

        Cookie orangehrmCookie = driver.manage().getCookieNamed("orangehrm");

        return orangehrmCookie.getValue();
    }

    public void homeDashboardIsVisible(){
        Bot.isVisible(driver,dashboard);
    }

    public Boolean boolHomeDashboardIsVisible(){
        return Bot.boolIsVisible(driver,dashboard);
    }


}
