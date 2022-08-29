package SeleniumModule3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTest1 {
	
WebDriver driver;
	
	@BeforeMethod
	public void LaunchBrowser()
	{
		
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://demo.guru99.com/test/login.html");
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
	Login("Shilpee","test@123");
			
		
	}
	
	@Test
	public void clickOnGuruPageTest()
	{
		
	}
	
	public void Login(String username,String password )
	{
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.name("passwd")).sendKeys( password);
		driver.findElement(By.id("SubmitLogin")).click();
	}
	
	@AfterMethod
	public void closeTheApplication()
	{
		driver.quit();
	}



}



