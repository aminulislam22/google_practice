package com.google.Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
	features ="Features",
	glue = "com.google.Steps"
		
		)


public class TestRunner extends AbstractTestNGCucumberTests{

}
