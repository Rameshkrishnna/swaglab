package TestRunner;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions(  
	    features = "src/test/java/features",
	    glue="loginPageSteps",monochrome=true,
	    plugin= {"pretty","html:target/cucumber","json:target/cucumber.json"})
public class testRunner {

}
