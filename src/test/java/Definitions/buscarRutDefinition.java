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

public class buscarRutDefinition {

    private WebDriver driver;

    public buscarRutDefinition(){
        driver= Hooks.driver;
    }
//
//    @Given("^busco usuario por rut \"(.*?)\"$")
//    public void buscar_rut_given(String rut) throws Throwable {
//        driver.findElement(By.id("rut")).sendKeys(rut);
//        driver.findElement(By.name("searchButton")).click();
//    }
//
//    @Given("^aparece vista \"(.*?)\"$")
//    public void vista_360_persona_given(String titulo) throws Throwable {
//        String titulo_360 = driver.findElement(By.id("v360_titulo")).getText();
//        assertTrue(titulo_360.contains(titulo));
//    }

    @When("^busco usuario por rut \"(.*?)\"$")
    public void buscar_rut(String rut) throws Throwable {
        driver.findElement(By.id("rut")).sendKeys(rut);
        driver.findElement(By.name("searchButton")).click();
    }

    @Then("^aparece vista \"(.*?)\"$")
    public void vista_360_persona(String titulo) throws Throwable {
        String titulo_360 = driver.findElement(By.id("v360_titulo")).getText();
        assertTrue(titulo_360.contains(titulo));
    }
}
