package end2endtesting;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= "C:\\Users\\antim\\git\\heartland\\Heartland_Qa\\End2End.feature", glue="end2endtesting",
plugin={"pretty","html:target/reports.html"})
public class RunnerTest {

}
