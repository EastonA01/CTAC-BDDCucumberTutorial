package runners;

import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/is_it_friday_yet.feature", // Path to the specific feature file
        glue = {"steps"}, // Package where your step definitions are located
        plugin = {"pretty"} // Optional: This will print the test results in a readable format
)
public class TestRunner {
}