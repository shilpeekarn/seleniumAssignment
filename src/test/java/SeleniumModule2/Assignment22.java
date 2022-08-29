package SeleniumModule2;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment22 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//maximize the window
		 driver.manage().window().maximize();
		 
	    //get the url of the application
		 driver.get("http://demo.guru99.com/popup.php");
		 
		 driver.findElement(By.linkText("Click Here")).click(); //click the button
		 
		 Set<String> windowHandles = driver.getWindowHandles(); // to store all window handles
		 System.out.println( windowHandles );
		 
		Iterator<String> iterator = windowHandles.iterator(); // to switch window
		String parentWindowHandle = iterator.next(); // it will iterate to parentWindow
		String childWindowHandle  = iterator.next(); // it will iterate to childWindow
		
		driver.switchTo().window(childWindowHandle);  // switch from parentWindow to ChildWindow
		 
		driver.findElement(By.name("emailid")).sendKeys("Admin");// enter email id
		
		Thread.sleep(1000);
		
		// close the browser
		driver.close();
		 
		 }



	}


