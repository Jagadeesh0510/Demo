package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="FeatureFiles/", 
				 glue={"stepDefinition","HooksDemo"},
				 //dryRun = true,
				 monochrome = true,
				 plugin = {"html:Report/HTMLReport", "json:Report/Json/report.json"},
				 tags = {"@Hooks"}//, @GoogleSearch, @OrangeLogin"}
				)
public class RunnerClass {
	
	//it should combine the feature file and step definition
	
		

}
