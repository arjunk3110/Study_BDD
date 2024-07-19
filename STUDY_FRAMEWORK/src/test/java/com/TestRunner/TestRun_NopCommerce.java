package com.TestRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		tags="",
		features={"src/test/resources/Feature/Parameterization_LoginNopCommerce.feature"},
		glue={"com.StepDefinition"},
		monochrome=true,
				 plugin= {"pretty","html:target/Cucumber_Reports/reports1.html"}
	
		
		)
public class TestRun_NopCommerce {

}



