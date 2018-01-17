package iPhone;

import org.testng.annotations.Test;
import pages.HomePage;
import reporting.TestLogger;

import static pages.AccessibilityPage.clickNodeProvider;
import static pages.AnimationPage.clickBouncingBalls;


public class TestHomePage extends HomePage{
    @Test
    public void test01() throws Exception {
        TestLogger.log("app is launched ...");
        clickAccessibility();
        clickNodeProvider();
        System.out.println("TC1 Passed");
    }
    @Test
    public void test02() throws Exception {
        clickAnimation();
        clickBouncingBalls();
        System.out.println("TC2 Passed");
    }
}
