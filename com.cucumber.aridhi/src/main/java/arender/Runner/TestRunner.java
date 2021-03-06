/**
 * 
 */
package arender.Runner;

import org.junit.runner.RunWith;
import org.openqa.selenium.firefox.FirefoxDriver.SystemProperty;

/**
 * @author ARIDHIHichem
 *
 */

@RunWith(Cucumber.class)
@CucumberOptions(
		features = SystemProperty("user_dir")+"\\src\\main\\java\\arender\\Feature\\uploadFile.feature",
		glue={"stepDefinitions"}, //the path of the step definition files
		format= {"pretty","html:test-outout", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"}, //to generate different types of reporting
		monochrome = true, //display the console output in a proper readable format
		strict = true, //it will check if any step is not defined in step definition file
		dryRun = false //to check the mapping is proper between feature file and step def file
		//tags = {"~@SmokeTest" , "~@RegressionTest", "~@End2End"}			
		)
public class TestRunner {

}
