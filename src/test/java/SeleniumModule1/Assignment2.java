package SeleniumModule1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
    
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe"); // set the property of driver executable file
	WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize(); // maximize the window
    driver.get("https://demo.guru99.com/test/radio.html");//launch the application
    
     Thread.sleep(1000);
				
	 driver.findElement(By.id("vfb-7-1")).click(); //in radio button select option 1
				
     driver.findElement(By.id("vfb-6-1")).click(); //select checkbox 2
				
     driver.findElement(By.id("vfb-6-2")).click(); //select checkbox3
				
	 driver.get("https://demo.guru99.com/test/newtours/register.php"); // launch the newtours application
				
     WebElement countryListBox = driver.findElement(By.xpath("//select[@name='country']"));
		        
     Select s = new Select(countryListBox);//passing reference variable in the element
	 s.selectByVisibleText("KUWAIT"); // select KUWAIT in countryListBox
	 
	 Thread.sleep(1000);
		        
	 driver.close();
		       

		}

}
