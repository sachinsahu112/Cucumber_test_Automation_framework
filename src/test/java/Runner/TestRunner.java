package Runner;

import io.cucumber.junit.CucumberOptions;

//	@RunWith(Cucumber.class)
@CucumberOptions(
		features="D:\\JavaProject\\CocumberBDDFramework\\src\\main\\java\\Features\\Login.feature"
		,glue= {"StepDefination"},
		dryRun=false,
		monochrome=true
		//format= {"pretty","html:test-output","json:json-output/cucumber.json","junit:junit_xml/cucumber.xml"},
		)
public class TestRunner {
	

}
