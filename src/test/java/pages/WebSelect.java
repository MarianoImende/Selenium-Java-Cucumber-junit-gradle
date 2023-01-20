package pages;

public class WebSelect extends BasePage {
   
    private String locator_DropDown = "//body/div[@id='document']/main[@id='content']/article[1]/section[2]/div[1]/div[1]/form[1]/p[1]/select[1]";
    
    public WebSelect() {
        super(driver);
       
    }

    public void navegateWebDown() {
        navegateTo("https://www.htmlquick.com/es/reference/tags/select.html#examples");   
    }

    public void selectDropDown(String Deporte) throws InterruptedException {

        String boton = "//input[@value='Enviar']";
        Maximize();

        scrollDown("300");
      
        selectFromDropdownByText(locator_DropDown,Deporte);
        
        sleep(5000);
        
        //hoverOverElement(boton);
        sleep(5000);
        click(boton);

        sleep(5000);

        CloseNavegate();    
}
}
