package Definitions;

import Pages.Login;
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

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;


public class loginDefinition {

    private WebDriver driver;

    public loginDefinition(){
        driver= Hooks.driver;
    }


    @Given("^Estoy en la pagina \"(.*?)\"$")
    public void estoy_en_la_pagina(String url) throws Throwable {
        driver.get(url);
        Thread.sleep(2000);
    }

    @Given("^inicio sesion con el usuario \"(.*?)\" y el password \"(.*?)\"$")
    public void inicio_sesion_con_el_usuario_y_el_password(String user, String pass) throws Throwable {

        Login objLogin = new Login(driver);
        objLogin.Login(user , pass );
    }

    @Given("^aparece escritorio comercial en pagina \"(.*?)\"$")
    public void aparece_escritorio_comercial(String titulo) throws Throwable {
        Thread.sleep(2000);
        assertTrue(driver.getTitle().contains(titulo));
    }

}
