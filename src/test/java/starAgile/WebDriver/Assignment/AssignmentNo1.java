package starAgile.WebDriver.Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//1. Write a WebDriver script to navigate to a website and click on a specific link.
public class AssignmentNo1 {

	public static void main(String[] args) {
		// Create a driver session
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://automationplayground.com/crm/");
		 //Click on a link "BestSellers"

		driver.findElement(By.linkText("Sign In")).click();
		
		//close the session
		
		driver.close();
	}

}
