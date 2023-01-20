package steps;
import pages.WebList;

import java.util.List;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class WebListSteps {

    WebList list = new WebList();

    @Given("^navego hasta la list page$")
    public void navego_hasta_la_list_page(){
        list.navegateWebList();;
    }

    @When ("^yo busco (.+) en la lista$")
    public void yo_busco_la_lista(String estado) throws InterruptedException  {        
       list.enterSearchCriteria(estado);
    }

    @Then ("^yo puedo buscar (.+) en la lista$")
    public void yo_puedo_buscar_el_texto_en_la_lista(String ciudad)  { 
        
        List<String> lista = list.getAllSearchResults();
        boolean testIsThere = lista.contains(ciudad);

        if (testIsThere){
            System.out.println("The text is on the list: PASSED");
        }else{
            throw new Error("The text is not on the list: FAILED");
        }      
    }
}
