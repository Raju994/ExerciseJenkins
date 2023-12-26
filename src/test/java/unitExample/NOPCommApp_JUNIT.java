package unitExample;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class NOPCommApp_JUNIT {

	ChromeDriver driver;
	
	//UNIT testing framework ------ JUNIT
	//execution workflow
	
	// Pre-condition --------------   Before
	// Test
	// Post-condition -------------   After

	@Before
	public void launchApp() {

		System.out.println("============launch app on chrome browser===========");
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");

	}
	
	
	@After
	public void closeApp() throws Exception {

		Thread.sleep(5000);
		
		System.out.println("===========closing an application============");
		driver.close();
		driver.quit();
		
	}
	
	

	@Test
	public void verifyLogin() {

		System.out.println("login test case !!");

	}

	
	

	
	
	
}
