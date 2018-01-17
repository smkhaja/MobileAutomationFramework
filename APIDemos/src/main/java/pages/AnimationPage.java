package pages;

import base.MobileAPI;

public class AnimationPage extends MobileAPI{

    public static void clickBouncingBalls() throws InterruptedException {
        text("Bouncing Balls").click();
        ad.tap(1,500,700, 1);
        Thread.sleep(3000);
        ad.tap(1,200,800, 1);
        Thread.sleep(3000);
        ad.tap(1,800,800, 1);
        Thread.sleep(3000);

    }
}