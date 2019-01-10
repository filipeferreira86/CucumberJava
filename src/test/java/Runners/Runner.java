package Runners;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features/Feature.feature",
		glue = "steps",
		plugin = "pretty",
		snippets = SnippetType.CAMELCASE,
		monochrome = true
		)

public class Runner {

}
