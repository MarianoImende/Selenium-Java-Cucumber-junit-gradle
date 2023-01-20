package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.WebDobleClickRightClick;

public class WebDobleClickRigthSteps {
    
    WebDobleClickRightClick objWeb= new WebDobleClickRightClick();

@Given ("^navego hasta la web$")
public void navego_hasta_la_web(){
    objWeb.navegateToWebDobleClickRightClick();
}

@When ("^sobre vuelo el boton de la web$")
public void sobre_vuelo_el_boton_de_la_web(){
    objWeb.SobreVuelo();
} 

@And ("^doy doble click$")
public void doy_doble_click(){
    objWeb.dobleClick();
} 
@And ("^presiono boton derecho$")
public void presiono_boton_derecho(){
     objWeb.ClickRight();
 } 
@Then ("^acepto el alert$")
public void acepto_el_alert() {
    objWeb.AceptAlerta();
}
}
