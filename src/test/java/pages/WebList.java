package pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;

public class WebList extends BasePage {
    
   private String searchResults = "name";
    private String searchField = "//body/form[1]/input[1]";
    
    public WebList() {
        super(driver);
       
    }

    public void navegateWebList() {
        navegateTo("https://andreidbr.github.io/JS30/06AjaxTypeAhead/index.html");   
    }                  

    public void enterSearchCriteria(String estado) throws InterruptedException {
        Maximize();
        sleep(600);
        try {
            escribir_Text_WebElement(searchField, estado);
        } catch (Exception e) {
            System.out.println("El elemento search Field no pudo ser encontrado");
            e.printStackTrace();;
        }
        
        
    }
public List<String> getAllSearchResults() {
    List<WebElement> list = traermeTodosLosElementos(searchResults);
    List<String> stringsFormList = new ArrayList<String>();
    for (WebElement e: list){
        stringsFormList.add(e.getText());
    }
    return stringsFormList;
}
}

