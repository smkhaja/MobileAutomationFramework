package iPhone;

import org.testng.annotations.Test;
import pages.HomePage;

public class TestPageObjectPattern extends HomePage{
    @Test
    public void pageObject() {
        clickAccessibility();
        back();
        clickAnimation();
        back();
        System.out.println("TC1 Passed");
    }
}
