package steps;
import pages.WebSelect;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import util.util;

public class WebSelectSteps {

    WebSelect WebDropDownObj = new WebSelect();

    @Given("^navego en webSelect$")
    public void navegoEnWebDownDrop(){
        WebDropDownObj.navegateWebDown();
    }

    @And ("^selecciono Basquetbol$")
    public void SeleccionoBasquetbol() throws InterruptedException {        
        System.out.println("uno " + util.reemplazarTilde("Básquetbol"));
        System.out.println("dos " + "B\u00e1squetbol");
        
        WebDropDownObj.selectDropDown("B\u00e1squetbol");
        //"B\u00e1squetbol"
        // B\u00e1squetbol
    }
}
