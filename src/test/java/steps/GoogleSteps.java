package steps;
import io.cucumber.java.en.When;
import pages.googlePage;

import org.junit.Assert;

//import org.junit.Assert;



import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class GoogleSteps {

    googlePage google = new googlePage();

    @Given("^navego en google$")
    public void navegoEnGoogle(){
        google.navegateToGoogle();
    }

    @When ("^busco algo$")
    public void buscoAlgo(){
        google.introText("Argentina");
    }

    @And ("^Click en boton buscar$")
    public void clickEnBotonBuscar(){
        google.ClickSearch();
    }
    
    @Then("^valido resultado$")
    public void valido_resultado() {
        
        Assert.assertEquals("Argentina.gob.ar: Inicio", google.validoTextoArgentina());
        
       
        
    }
}
