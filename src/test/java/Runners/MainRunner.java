package Runners;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        monochrome = true,
        publish = true,
        features = "src/test/resources/features",
        glue = "Definitions",
        tags = "@Regresion",
        plugin = { "pretty" ,
                "json:src/test/resources/reportes/cucumber.json",
                "html:src/test/resources/reportes/cucumber.html"
        },
        snippets = CucumberOptions.SnippetType.CAMELCASE)
public class MainRunner {

}
