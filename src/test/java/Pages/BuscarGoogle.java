package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.SendKeysAction;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class BuscarGoogle extends Generics{

    WebDriver driver;

    public BuscarGoogle(WebDriver driver){
        super(driver);
        this.driver= driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(name="q")
    WebElement cajaBuscar;


    public void buscarPalabra(String buscar){
        waitForElementToBeVisible(cajaBuscar);
        cajaBuscar.sendKeys(buscar);
        cajaBuscar.submit();
    }

}
