package pages;



public class WebDobleClickRightClick extends BasePage {

    private String locatorDobleClick = "//button[text()='Double-Click Me To See Alert']";
                                        
    private String locatorRightClick = "//span[contains(text(),'right click me')]";

    public WebDobleClickRightClick() {
        super(driver);
    }

public void navegateToWebDobleClickRightClick(){
        navegateTo("https://demo.guru99.com/test/simple_context_menu.html");
}

public void SobreVuelo(){
    hoverOverElement(locatorDobleClick);
  
}

public void dobleClick(){
    dobleClick(locatorDobleClick);
}
public void ClickRight(){
    rigthClick(locatorRightClick);
} 

public void AceptAlerta() {
    aceptAlert();
}
}
