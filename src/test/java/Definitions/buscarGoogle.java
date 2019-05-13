package Definitions;

import baseDatos.coneccionDB;
import Pages.BuscarGoogle;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.sql.Connection;
import java.sql.ResultSet;

import static org.junit.Assert.assertTrue;

public class buscarGoogle {

    coneccionDB cn = new coneccionDB();


    private WebDriver driver;
    public buscarGoogle(){
        driver= Hooks.driver;
    }

    @When("^busco \"(.*?)\"$")
    public void busco(String palabra) throws Throwable {
        String query = "SELECT RUT FROM CN_CLIENTES_BCO WHERE ROWNUM <= 1;";

        BuscarGoogle buscarGoogle = new BuscarGoogle(driver);
        buscarGoogle.buscarPalabra(palabra);

        /*Connection conexion = cn.getConexion();
        ResultSet rs = cn.RunQuery(conexion,query);

        while (rs.next()) {
            int rut = rs.getInt("RUT");
            System.out.println("Prueba: "+rut);
        }

        cn.OracleCloseConnection(conexion);

         */
    }

    @Then("^aparece informacion sobre \"(.*?)\"$")
    public void aparece_informacion_sobre(String palabra) throws Throwable {
        String palabraBuscada = driver.findElement(By.xpath("(//h3[contains(text(),'autos')])[1]")).getText();
        assertTrue(palabraBuscada.contains(palabra));
    }

}
