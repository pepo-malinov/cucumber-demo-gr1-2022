package uni.fmi;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(monochrome = true, plugin = { "pretty", "html:target/cucumber-login" }, glue = { "uni.fmi.register",
		"uni.fmi.login" }, features = {"src/test/resources/uni/fmi/login", "src/test/resources/uni/fmi/register"})
public class HomeScreenStarter {

}
