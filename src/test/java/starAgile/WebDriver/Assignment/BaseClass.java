package starAgile.WebDriver.Assignment;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;


public class BaseClass {

		static WebDriver driver;
		LoginPage lp;
		
		
		@BeforeClass
		public void setup() {
			
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://automationplayground.com/crm/");
	
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			lp=new LoginPage(driver);
			
		
		}
		@AfterClass
		public void tearDown() {
			driver.close();
		}

	
		
		

}
