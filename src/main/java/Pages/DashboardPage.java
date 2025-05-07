package Pages;

import Bots.Bot;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage {
    WebDriver driver;
    public DashboardPage(WebDriver driver){this.driver = driver;}

    //// Locators ////
    private final By dashboardHeader = By.xpath("//h6[text() = 'Dashboard']");


    //// Methods ////
    public Boolean isDashboardHeaderVisible(){
        return Bot.boolIsVisible(driver,dashboardHeader);
    }
}
