package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/resources/features/Login.feature", 
glue= {"stepdefinitions"} 
) 

public class TestRunner extends AbstractTestNGCucumberTests{

}
