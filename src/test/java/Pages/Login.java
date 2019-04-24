package Pages;

import Definitions.Hooks;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login extends Generics{

    WebDriver driver;

    public Login(WebDriver driver){
        super(driver);
        this.driver= driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id="username")
    WebElement username;

    @FindBy(xpath="//input[@name='password' and contains(@ng-model,'password')]")
    WebElement password;

    @FindBy(id="idIngresar")
    WebElement botonIngresar;

    public void ingresarUsuario(String user){
        waitForElementToBeVisible(username);
        username.sendKeys(user);
    }

    public void ingresarPassword(String pass){
        waitForElementToBeVisible(password);
        password.sendKeys(pass);
    }

    public void clickLogin(){
        waitForElementToBeVisible(botonIngresar);
        botonIngresar.click();
    }

    public String getLoginTitle(){
        return    driver.getTitle();
    }

    public void Login(String usuario,String password){

        //ingresa usuario
        this.ingresarUsuario(usuario);

        //ingresa password
        this.ingresarPassword(password);

        //Clickea el boton login
        this.clickLogin();
    }
}
