package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/FeaturesFile/CRM.feature",
					glue="stepdef",
					plugin={"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
public class CRMRunner {

}
