package starAgile.WebDriver.Assignment;

import org.testng.Assert;

//2. Implement a Page Object Model for a login page using WebDriver.

import org.testng.annotations.Test;

public class PageObjectModelUsingWebDriver extends BaseClass {
  @Test(priority=1)
  public void validateSigninLink() {
	  lp.doClickSigninLink();
	  Assert.assertTrue(driver.getCurrentUrl().contains("login"),"Not landed on Login page !!");
	  
	  System.out.println("Landed on login page Kindly enter valid email and password ");  
  }
  @Test(priority=2)

  public void validateLogin() {
	  lp.doLogin();
	  Assert.assertTrue(driver.getCurrentUrl().contains("customers"),"Login Failed");
	  System.out.println("Login Successfull");
  }
  
  
}
