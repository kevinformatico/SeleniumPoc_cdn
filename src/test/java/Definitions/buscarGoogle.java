package Definitions;

import Pages.BuscarGoogle;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import sun.security.util.PendingException;

import static org.junit.Assert.assertTrue;

public class buscarGoogle {

    private WebDriver driver;

    public buscarGoogle(){
        driver= Hooks.driver;
    }

    @When("^busco \"(.*?)\"$")
    public void busco(String palabra) throws Throwable {
        BuscarGoogle buscarGoogle = new BuscarGoogle(driver);
        buscarGoogle.buscarPalabra(palabra);
    }

    @Then("^aparece informacion sobre \"(.*?)\"$")
    public void aparece_informacion_sobre(String palabra) throws Throwable {
        String palabraBuscada = driver.findElement(By.xpath("(//h3[contains(text(),'autos')])[1]")).getText();
        //assertTrue(palabraBuscada.contains(palabra));
    }

}
