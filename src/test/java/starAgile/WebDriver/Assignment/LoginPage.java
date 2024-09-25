package starAgile.WebDriver.Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass{
	
	public LoginPage(WebDriver driver) {
		
		BaseClass.driver=driver;
		
		PageFactory.initElements(driver,this);
		
	}
 
	//Locators
	
	By signLink=By.linkText("Sign In");
	
	@FindBy(name="email-name")
	WebElement email;
	
	@FindBy(id="password")
	WebElement pwd;
	
	@FindBy(id="submit-id")
	WebElement sbtn;
	
	//Action Method
	
	public void doClickSigninLink() {
		
		
		driver.findElement(signLink).click();
	}
	 
	public void doLogin() {
		
		email.sendKeys("test@gmail.com");
		pwd.sendKeys("test123");
		sbtn.click();
	}
	 
	
}
