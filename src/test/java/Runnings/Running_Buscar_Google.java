package Runnings;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"junit:target/cucumber.xml", "json:target/cucumber.json"})

public class Running_Buscar_Google extends Running{
}
