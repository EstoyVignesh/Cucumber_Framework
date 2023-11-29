package gluecode;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utils.Utils;


public class Hooks {
	
	
	Utils util = new Utils();
	
	@Before
	public void beforeScenario(Scenario scenario)
	{
		
		String scenarioName= scenario.getName();
		System.out.println("Scenario name-->"+scenarioName);
		util.launchBrowser("https://www.google.com");
	}
	
	@After
	public void afterScenario() {
		Utils.driver.quit();
	}

}
