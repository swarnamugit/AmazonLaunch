package Steps;

import io.cucumber.core.backend.Glue;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features= "src/test/resources/Features/Amazon.feature",
		glue= "Steps",
		plugin={"pretty","json:target/Dummyreport.json"}
		)
public class RunnerFile extends AbstractTestNGCucumberTests { 


	
}
