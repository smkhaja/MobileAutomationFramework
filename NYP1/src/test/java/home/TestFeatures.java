package home;

import base.MobileAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.MainPage;
import reporting.TestLogger;

public class TestFeatures extends MobileAPI {
    @Test
    public void home() throws InterruptedException {
        TestLogger.log("app1 is launched ...");
        MainPage mainPage = PageFactory.initElements(ad, MainPage.class);
        mainPage.clickMenu();
        mainPage.clickNews();
        System.out.println("TC1 Passed");
    }
}
