package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Vista360 extends Generics{

    WebDriver driver;

    public Vista360(WebDriver driver){
        super(driver);
        this.driver= driver;
        PageFactory.initElements(driver, this);
    }


    @FindBy(id="rut")
    WebElement cajaRut;

    @FindBy(name="searchButton")
    WebElement botonSearch;

    @FindBy(id="v360_titulo")
    WebElement tituloV360;

    public void ingresarRut(String rut){
        waitForElementToBeVisible(cajaRut);
        cajaRut.sendKeys(rut);
    }

    public void clickSearch(){
        waitForElementToBeVisible(botonSearch);
        botonSearch.click();
    }

    public void validaTitulo(){
        waitForElementToBeVisible(tituloV360);
    }

}
