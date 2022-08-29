package SeleniumModule3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNgAssignmentTest2 {
	
WebDriver driver;
	
	@BeforeMethod //This annotated method will be run before each test method
	public void LaunchBrowser()
	{
		
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().deleteAllCookies();
    driver.get("https://demo.guru99.com/test/login.html");
    driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
			
		
		
	}
	@DataProvider(name = "loginTestData") 
	public Object[][] LoginData() // void method should not return any data so change the return type to two dimension array
	{
		Object[][] data = new Object[2][2];
		data[0][0] ="Admin";
		data[0][1] = "admin123";
		
		data[1][0] = "Admin";
		data[1][1] = "test123";
		
		return data;
	}
	
	@Test(dataProvider = "loginTestData")
	public void guru99PageTest(String userID, String Password) throws InterruptedException
	{
		driver.findElement(By.id("email")).sendKeys(userID); //enter emailID
		driver.findElement(By.name("passwd")).sendKeys(Password); //enter password
		driver.findElement(By.id("SubmitLogin")).click(); //click on submitLogin button
		Thread.sleep(2000);
	}
	
	@AfterMethod //This annotated method will be run after each test method
	public void closeTheApplication()
	{
		driver.quit();
	}

}



