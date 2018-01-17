package pages;

import base.MobileAPI;

public class HomePage extends MobileAPI{

    public void clickAccessibility(){
      text("Accessibility").click();
    }
    public void clickAnimation(){
        text("Animation").click();
    }
}