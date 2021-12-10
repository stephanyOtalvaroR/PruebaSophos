package sophos.test.runnesrs;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/work_with_us.feature",
        glue = "sophos.test.stepdefinitions",
        snippets = SnippetType.CAMELCASE)

public class WorkWithUs {
}
