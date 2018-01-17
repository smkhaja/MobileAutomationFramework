package pages;

import base.MobileAPI;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;


public class MainPage extends MobileAPI {

    @FindBy(xpath = "//*[contains(text(),'Continue')]")
    WebElement continueByXpath;
    @FindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Menu\"]")
    WebElement menu;

    public void clickContinue() {
        System.out.println("Im in clickContinue method...");
    }
    public void clickMenu(){
        sleep(1);
        menu.click();
        sleepFor(1);
        System.out.println("Menu btn clicked ...");
    }
    public void getMenuItems(){
        List<WebElement> items = ad.findElements(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout[1]/android.widget.FrameLayout"));
        for (WebElement webElement : items){
            System.out.println("Item: " + webElement.getText());
            sleepFor(1);
        }
    }
    public void clickNews(){
        WebElement news = ad.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.LinearLayout"));
        news.click();
        sleepFor(3);
    }
}
