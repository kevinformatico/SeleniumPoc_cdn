package Runnings;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(tags = "@buscargoogle", plugin = {"junit:target/cucumber.xml"})

public class Running_Buscar_Google extends Running{
}
