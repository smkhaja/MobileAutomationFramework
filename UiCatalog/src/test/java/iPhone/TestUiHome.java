package iPhone;

import org.junit.Before;
import org.testng.annotations.Test;
import pages.UiHome;
import reporting.TestLogger;

public class TestUiHome extends UiHome {
    @Test
    public void test1(){
        TestLogger.log("app is launched ...");
        clickBtns();
        System.out.println("btns clicked ...");
    }
}
