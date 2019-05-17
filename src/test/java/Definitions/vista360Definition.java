package Definitions;

import Pages.Vista360;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import static org.junit.Assert.assertTrue;

public class vista360Definition {

    private WebDriver driver;
    Vista360 pageVista360 = new Vista360(driver);

    public vista360Definition(){
        driver= Hooks.driver;
    }

    @When("^busco usuario por rut \"(.*?)\"$")
    public void buscar_rut(String rut) throws Throwable {

        pageVista360.ingresarRut(rut);
        pageVista360.clickSearch();
    }

    @Then("^aparece vista \"(.*?)\"$")
    public void vista_360_persona(String titulo) throws Throwable {
        pageVista360.validaTitulo();
    }

}
