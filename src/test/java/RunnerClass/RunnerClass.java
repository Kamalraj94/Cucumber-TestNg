package RunnerClass;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/java",
        glue = {"StepDefinations"},
        plugin = "json:target/cucumber-reports/CucumberTestReport.json",
        tags = "@Test_1")



public class RunnerClass  extends AbstractTestNGCucumberTests   {

	

}



