package pages;
public class googlePage extends BasePage{
        
private String locator_searchBoton = "//input[@value='Buscar con Google']";
private String locator_textBox =  "//body/div[1]/div[3]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/input[1]";
private String ArgentinaLocator = "//h3[contains(text(),'Argentina.gob.ar: Inicio')]";

public googlePage(){
        super(driver);
}
 
public void navegateToGoogle() {
    navegateTo("https://www.google.com/");
    Maximize();   
}

public void ClickSearch() {
    click(locator_searchBoton);
}

public void introText(String Criterio) {
    escribir_Text_WebElement(locator_textBox,Criterio);
}

public String validoTextoArgentina(){
    return GetTextoFromElement(ArgentinaLocator);
}

}