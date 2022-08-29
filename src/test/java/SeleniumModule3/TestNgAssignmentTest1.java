package SeleniumModule3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNgAssignmentTest1 {
	

	WebDriver driver;
	
	@BeforeMethod
	public void LaunchBrowser()
	{
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
              driver.get("https://demo.guru99.com/test/login.html"); //to get the url 
		
	}
	@Test
	public void verifyPageTitleTest() 
	{
		String title= driver.getTitle();
		System.out.println("the page title is :"+ title);
		Assert.assertEquals(title,"Login Page");
	}
	
	
    @AfterMethod
	public void closeTheApplication()
	{
		driver.quit();
	}

}



