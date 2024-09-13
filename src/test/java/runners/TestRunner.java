package runners;

import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/is_it_friday_yet.feature", // Path to the specific feature file
        glue = {"steps"}, // Package where step definitions are located
        plugin = {"pretty"} // This makes the output prettier :D
)
public class TestRunner {
}