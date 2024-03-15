package com.FeatureRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(features = "src\\test\\resources\\FeaturesFiles", glue = "com.cucumberSteps")
public class FeatureRunner extends AbstractTestNGCucumberTests{
	
}
 