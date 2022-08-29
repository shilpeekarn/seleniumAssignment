package SeleniumModule2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//maximize the window
		 driver.manage().window().maximize();
		 
	    //get the url of the application
		 driver.get("https://demo.guru99.com/test/delete_customer.php");
		 
		 //enter customer ID
		 driver.findElement(By.name("cusid")).sendKeys("1176");
		 
		 //click on submit button
		 driver.findElement(By.name("submit")).click();
		 
		 //handling alert popup in selenium
		 Alert alert = driver.switchTo().alert();
		 
		 //wait for 1 second
		 Thread.sleep(1000); 
		 
	     alert.accept(); // click on one prompt popup
		
		 alert.accept(); // click on again prompt popup 
		 
		 //wait for 1 second
		 Thread.sleep(1000);
		 
		 //close the browser
		  driver.close();
	

	}

}
