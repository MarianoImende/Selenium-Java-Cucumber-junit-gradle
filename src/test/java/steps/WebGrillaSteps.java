package steps;

import org.junit.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.WebGrilla;

public class WebGrillaSteps {
    WebGrilla grilla = new WebGrilla();


@Given("^navego hasta la tabla estatica$")
public void hasta_la_tabla_estatica(){
    grilla.navegateToWebGrilla();
}

@When ("^selecciono un valor de fila y columna$")
public void selecciono_un_valor_de_fila_y_columna() throws InterruptedException{
    
    final String value = grilla.getValueFromTable(1, 1);
    System.out.println("asasasasasasasasasasas  " + value);
    Assert.assertEquals("Job Doe",value);

    
}
@And ("^ingreso un valor de fila y columna$")
public void ingreso_un_valor_de_fila_y_columna() {
    
    grilla.setValueOnTable(1, 1, "pepe");
    
}
@When ("^valido que la table esta desplegada$")
public void valido_que_la_table_esta_desplegada(){ 
    
    Assert.assertTrue("la tabla esta desplegada", grilla.getStatusCell());
}

}