package iPhone;

import org.testng.annotations.Test;
import pages.HomePage;
import reporting.TestLogger;

public class TestPageObjectPattern extends HomePage{
    @Test
    public void pageObject() {
        TestLogger.log("app is launched ...");
        clickAccessibility();
        back();
        clickAnimation();
        back();
        System.out.println("TC1 Passed");
    }
}
