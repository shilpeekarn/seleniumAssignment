package SeleniumModule2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();

	//maximize the window
    driver.manage().window().maximize();
				 
	 //get the url of the application
	 driver.get("https://demo.guru99.com/test/web-table-element.php");
			 
	 //rows in a table
	 int rows= driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr")).size();
				
	  System.out.println("Total number of rows in a table :" + rows);
				
	  //column in a table
				
	  int column= driver.findElements(By.xpath("//table[@class='dataTable']//thead/tr/th")).size();

	  System.out.println("Total number of column in a table :"+ column);
				
	  // retrieve  the specific rows/column data

	  String value= driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr[2]/td[1]")).getText();
						
	   System.out.println("The value is :"+ value);	
				
    	//retrieve all the data from the table
		 for(int r=1; r<rows; r++)
		 {
			    for(int c=1; c<column; c++)
				{
					   String data= driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr["+r+"]/td["+c+"]")).getText();
				           System.out.print(data +" ");
				           
					}
			      	     System.out.println();	
			      	   
				}
				
	   	// get the url of guru99
		driver.get("https://demo.guru99.com/test/login.html");
				
		//enter email
		driver.findElement(By.id("email")).sendKeys("shilpee");
				
		//enter password
		driver.findElement(By.name("passwd")).sendKeys("shilpee123");
				
		//click on sign in button
		driver.findElement(By.name("SubmitLogin")).click();
				
		Thread.sleep(1000);
				
		//close the application
		 driver.close();
		 
				
			}



	

}
