package starAgile.WebDriver.Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class StudentRegistration {
  @Test
  public void testDemo1() 
  {
  WebDriver driver=new ChromeDriver();
  
  driver.manage().window().maximize();
  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
  
  driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
  
  driver.findElement(By.id("name")).sendKeys("Anthiony Gunsaalvis");
  
  driver.findElement(By.id("email")).sendKeys("loveujaan9se12@gmail.com");
  
  driver.findElement(By.xpath("//input[@id='gender']")).click();
  
  driver.findElement(By.id("mobile")).sendKeys("9893929091");
  
  driver.findElement(By.id("dob")).sendKeys("31121990");
  
  driver.findElement(By.id("subjects")).sendKeys("Selenium WebDriver");
  
  driver.findElement(By.xpath("//input[@id='hobbies']")).sendKeys(Keys.SPACE);
  
  driver.findElement(By.id("picture")).sendKeys("/Users/mayanktiwari/Desktop/check.png");
  
  
  driver.findElement(By.xpath("//textarea[@class='form-control']")).sendKeys("Roop Mahal prem gali kholi no 420");
  
  WebElement state=driver.findElement(By.id("state"));
  
  Select sc=new Select(state);
  
  sc.selectByIndex(2);
  
  WebElement city =driver.findElement(By.id("city"));
  
  Select sc1=new Select(city);
  sc1.selectByIndex(2);
  
  driver.findElement(By.xpath("//input[@type='submit']")).click();
  
  
  
  
  }
}
