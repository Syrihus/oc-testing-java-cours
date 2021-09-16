package org.openclassrooms.testing.cacul.acceptance;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features", plugin = { "pretty", "html:target/html-cucumber-report" })
public class CucumberAIT {

}
