package starAgile.WebDriver.Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class RegistrationFormDemo {
  @Test
  public void testForm() {
	  
	  //Create a driver session
	  WebDriver driver=new ChromeDriver();
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  //driver.manage().window().maximize();
	  
	  driver.get("https://demo.automationtesting.in/Register.html");
	  
	  //Enter Details
	  
	  driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("Anthony");
	  
	  driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Gunsalvis");
	  
	  driver.findElement(By.xpath("//div//textarea")).sendKeys("Room Mahal,Prem gali Kholi No. 420");
	  
	  driver.findElement(By.xpath("//input[@type='email']")).sendKeys("loveujaan9se12@gmail.com");
	  
	  driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("9893929190");
	  
	  driver.findElement(By.xpath("(//input[@type='radio'])[1]")).click();
	  
	  driver.findElement(By.xpath("//input[@id='checkbox3']")).click();
	  
	  driver.findElement(By.id("msdd")).click();
	  
	  driver.findElement(By.linkText("English")).click();
	  
	  WebElement ddele=driver.findElement(By.id("Skills"));
	  
	  Select sc=new Select(ddele);
	  
	  sc.selectByValue("Adobe Photoshop");
	  
	driver.findElement(By.xpath("//span[@role='presentation']")).click();
	 
	driver.findElement(By.xpath("(//li[@role='treeitem'])[6]")).click();
	
	WebElement year=driver.findElement(By.id("yearbox"));
	Select sc1=new Select(year);
	sc1.selectByValue("1992");
	
	WebElement month=driver.findElement(By.xpath("//select[@placeholder='Month']"));
	Select sc2=new Select(month);
	sc2.selectByValue("June");
	
	WebElement date=driver.findElement(By.id("daybox"));
	Select sc3=new Select(date);
	sc3.selectByValue("14");
	
	driver.findElement(By.id("firstpassword")).sendKeys("1234567891011");
	driver.findElement(By.id("secondpassword")).sendKeys("1234567891011");
	
	driver.findElement(By.id("submitbtn")).click();
	
	  
  }
}
