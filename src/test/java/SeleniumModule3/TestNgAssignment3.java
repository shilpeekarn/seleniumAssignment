package SeleniumModule3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNgAssignment3 {
	
	WebDriver driver;
	
	@BeforeMethod (alwaysRun = true)
	public void LaunchBrowser()
	{
	    System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	   driver = new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.manage().deleteAllCookies();
	   driver.get("https://demoqa.com"); //to get the url  
	    }
		
	   @Test(groups = {"smoke"})
	    public void test1()
	   {
			System.out.println("this is test1 method");
	  }
		

	@Test(groups = {"smoke"})
	   public void test2()
	   {
			System.out.println("this is test2 method");
	  }
	   
		
	@Test(groups = {"Regression"})
	 public void StudentRegistrationFormTest()
	{
			
	        driver.findElement(By.xpath("(//div[@class='card mt-4 top-card'])[2]")).click();
	        driver.findElement(By.xpath("//span[contains(text(),'Practice Form')]")).click();
	        driver.findElement(By.id("firstName")).sendKeys("raj");
	        driver.findElement(By.id("lastName")).click();
	        driver.findElement(By.id("lastName")).sendKeys("jha");
	        driver.findElement(By.id("userEmail")).sendKeys("raj@123");
	        driver.findElement(By.xpath("//div[contains(text(),'Gender')]")).click();
	        driver.findElement(By.id("userNumber")).sendKeys("9078567895");
	        driver.findElement(By.id("dateOfBirthInput")).sendKeys("24-08-2000");
	   
	      }
		
	@AfterMethod
	public void closeTheApplication()
	{
		driver.quit();
	}

	}




