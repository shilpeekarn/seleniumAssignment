package SeleniumModule1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Assignment1 {

	public static void main(String[] args) throws InterruptedException {
    
		
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	

	//System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
	
	//to run the script in chrome browser
	WebDriver driver= new ChromeDriver();
	   
    //to maximize the window
	driver.manage().window().maximize();
	
	//to launch the application 
    driver.get("https://www.amazon.in/");
    
    //wait for 2 sec
    Thread.sleep(2000);
    
    //actualAmazonTitle
	String actualAmazonTitle = driver.getTitle();
	
	//print title of amazon page
	System.out.println("title of amazon page is :" + actualAmazonTitle);
	
	//expected Amazon Title
	String expectedAmazonTitle = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
	
	//compare actualAmazonTitle and expectedAmazonTitle 
	Assert.assertEquals(actualAmazonTitle,expectedAmazonTitle  );
	
    driver.navigate().to("https://www.facebook.com/");//navigate amazon page to facebook page
	    
	 //driver.navigate().forward();// facebook
	//driver.navigate().back(); // amazon
	//driver.navigate().refresh();// refresh the page
    //wait for 2 second
	 Thread.sleep(2000);
	
	//actualFacebookTitle
	String actualFacebookTitle = driver.getTitle();
	
	//print title of amazon page
	System.out.println("title of facebook page :"+actualFacebookTitle );
	
	//expected Facebook Title
	String expectedFacebooktitle = "Facebook – log in or sign up";
	Assert.assertEquals(actualFacebookTitle , expectedFacebooktitle);
		
    //close the application
	driver.close();
	
    }




	

}
