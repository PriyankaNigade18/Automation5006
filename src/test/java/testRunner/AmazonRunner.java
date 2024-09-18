package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

/*
 * to run one scenario tags=@mobile
 * to run two scenario tags=@homepage or @mobile
 * to ignore only one scenario tags=not @mobile
 */
@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/FeaturesFile/amazon.feature",
				glue="stepdef",
				tags="not @ignore",
				publish=true)
public class AmazonRunner {

}
