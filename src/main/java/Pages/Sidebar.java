package Pages;

import Bots.Bot;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.lang.ref.PhantomReference;

public class Sidebar {
    WebDriver driver;
    public Sidebar(WebDriver driver){this.driver = driver;}

    //// locators ////
    private final By brandBanner      = By.xpath("//div[@class = 'oxd-brand-banner']");
    private final By searchBox        = By.xpath("//input[@placeholder = 'Search']");
    private final By adminItem        = By.xpath("//span[text() = 'Admin']");
    private final By PIMItem          = By.xpath("//span[text() = 'PIM']");
    private final By leaveItem        = By.xpath("//span[text() = 'Leave']");
    private final By timeItem         = By.xpath("//span[text() = 'Time']");
    private final By recruitmentItem  = By.xpath("//span[text() = 'Recruitment']");
    private final By myInfoItem       = By.xpath("//span[text() = 'My Info']");
    private final By performanceItem  = By.xpath("//span[text() = 'Performance']");
    private final By dashboardItem    = By.xpath("//span[text() = 'Dashboard']");
    private final By directoryItem    = By.xpath("//span[text() = 'Directory']");
    private final By maintenanceItem  = By.xpath("//span[text() = 'Maintenance']");
    private final By claimItem        = By.xpath("//span[text() = 'Claim']");
    private final By buzzItem         = By.xpath("//span[text() = 'Buzz']");

    private By sidebarItem(String item){return By.xpath("//input[@placeholder = '"+item+"']");}

    //// methods ////
    public void isBrandBannerVisible(){
        Bot.isVisible(driver,brandBanner);
    }

    public void search(String searchText){
        Bot.enterText(driver,searchBox,searchText);
    }

    public void selectAdmin(){
        Bot.clicking(driver,adminItem);
    }

    public void selectPIM(){
        Bot.clicking(driver,PIMItem);
    }

    public void selectLeave(){
        Bot.clicking(driver,leaveItem);
    }

    public void selectTime(){
        Bot.clicking(driver,timeItem);
    }

    public void selectRecruitment(){
        Bot.clicking(driver,recruitmentItem);
    }

    public void selectMyInfo(){
        Bot.clicking(driver,myInfoItem);
    }

    public void selectPerformance(){
        Bot.clicking(driver,performanceItem);
    }

    public void selectDashboard(){
        Bot.clicking(driver,dashboardItem);
    }

    public void selectDirectory(){
        Bot.clicking(driver,directoryItem);
    }

    public void selectMaintenance(){
        Bot.clicking(driver,maintenanceItem);
    }

    public void selectClaim(){
        Bot.clicking(driver,claimItem);
    }

    public void selectBuzz(){
        Bot.clicking(driver,buzzItem);
    }

    public void selectItem(String item){
        Bot.clicking(driver,sidebarItem(item));
    }
}
