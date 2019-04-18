package Definitions;

import cucumber.api.PendingException;
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

public class loginDefinition {

    public static WebDriver browser;

    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        browser = new ChromeDriver();
    }

    /*@After
    public void tearDown(){
        browser.quit();
    }
    */

    @Given("^Estoy en la pagina \"(.*?)\"$")
    public void estoy_en_la_pagina(String url) throws Throwable {
        browser.get(url);
        Thread.sleep(2000);
    }

    @When("^inicio sesion con el usuario \"(.*?)\" y el password \"(.*?)\"$")
    public void inicio_sesion_con_el_usuario_y_el_password(String user, String pass) throws Throwable {
        browser.findElement(By.xpath("//input[@id='username']")).sendKeys(user);
        Thread.sleep(1000);
        browser.findElement(By.xpath("//input[@name='password' and contains(@ng-model,'password')]")).sendKeys(pass);
        Thread.sleep(1000);
        browser.findElement(By.id("idIngresar")).click();
        Thread.sleep(1000);
    }

    @Then("^aparece escritorio comercial en pagina \"(.*?)\"$")
    public void aparece_escritorio_comercial(String titulo) throws Throwable {

        assertTrue(browser.getTitle().contains(titulo));
    }













}
