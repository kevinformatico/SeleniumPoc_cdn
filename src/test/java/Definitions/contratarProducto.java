package Definitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertTrue;

public class contratarProducto {

    private WebDriver driver;

    public contratarProducto(){
        driver= Hooks.driver;
    }

    @When("^contrato un producto")
    public void contratar_boton() throws Throwable {
        driver.findElement(By.xpath("//ng-include[not(contains(@class,'ng-hide'))]//button[contains(@ng-click,'linkContrar')]")).click();
    }

    @Then("^aparecen cliente datos \"(.*?)\"$")
    public void valida_alerta_datos_incompletos(String mensaje_alerta) throws Throwable {
        String titulo_360 = driver.findElement(By.xpath("//ng-include[not(contains(@class,'ng-hide'))]//section[@id='error-handler_alerta_error-template']//h5[contains(text(),'datos incompletos')]")).getText();
        assertTrue(titulo_360.contains(mensaje_alerta));
    }



}
