package SeleniumModule4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class pom {

	public static void main(String[] args) throws InterruptedException, IOException {

	
					
    System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
    WebDriver driver = new ChromeDriver();
					
	//maximize the window
	 driver.manage().window().maximize();
					 
	//get the url of the application
	 driver.get("https://itechnotion.com/what-will-be-the-cost-of-an-app-like-justdial-its-indias-no-1-local-business-directory/");

	 //delete cookies
	 driver.manage().deleteAllCookies();

	 //number of header present in itechnotion homepage
	 List<WebElement> headers= driver.findElements(By.xpath("//*[@id=\"pixzlo-main-menu\"]//a"));
	 System.out.println("number of header present in the itechnotion :" + headers.size());
				 
	 //Retrieve all headers
	  for(int i=0; i<headers.size(); i++)
	  {
		  System.out.println("number of header present in the itechnotion :" + headers.get(i).getText());
		  
	  } 
		  //click on product
	   driver.findElement(By.xpath("(//a[contains(text(),'Products')])[2]")).click();
				 
	   //select vDoctor
	   driver.findElement(By.xpath("(//a[contains(text(),'vDoctor')])[2]")).click();
				 
				 
	   //click on the features
	   driver.findElement(By.xpath("(//a[contains(text(),'Features')])[1]")).click();
				 
	  //number of Features options available in starupforest homepage
	   List<WebElement> Features= driver.findElements(By.xpath("//section[@id='nfeatures']//a"));
	   System.out.println("number of features present in the itechnotion :" + Features.size());
			    
	   //Retrieve all Features
	    for(int i=0; i<Features.size(); i++)
	    {
			      System.out.println("number of Features present in the itechnotion :" + Features.get(i).getText());
					  	    
	    }	 
					 
		 //click on technology
	    driver.findElement(By.xpath("//a[contains(text(),'Technology')]")).click();
				  
	  //number of Technologies available in starupforest homepage
	   List<WebElement> technologies= driver.findElements(By.xpath("(//div[@class='row align-items-center'])[4]"));
	   System.out.println("number of technologies present in the itechnotion :" + technologies.size()); 
				 
		//Retrieve all technologies
		 for(int i=0;i<technologies.size();i++)
		 {
		    System.out.println("number of technologies present in the itechnotion :" + Features.get(i).getText());
					  	    
		  }	 
				    
		  //click on get quote
		 driver.findElement(By.xpath("(//a[text() = 'Get Quote'])[1]")).click();
			 
		 //Enter ExcelSheet Data in the form
				  
			 
		 FileInputStream file  = new FileInputStream("data/data1.xlsx"); //to read the data from excel sheet
			 
	     XSSFWorkbook workbook  = new XSSFWorkbook(file); //creating a workbook object
			 
		  XSSFSheet sheet = workbook.getSheet("sheet1");//get first sheet from the workbook
		 // XSSFSheet sheet  = workbook.getSheetAt(0); // providing sheet index
			 
		  int noOfRows= sheet.getLastRowNum(); //get first row from the sheet
			 

			     for(int row =1;row<=noOfRows;row++)
			     {
			    	   
			      XSSFRow currentRow = sheet.getRow(row);  //focus on current row
			 	
			     String FullName  = currentRow.getCell(0).getStringCellValue(); //get the value from cell
			     String Email     = currentRow.getCell(1).getStringCellValue();
			     String Country   = currentRow.getCell(2).getStringCellValue();
			     String Interest  = currentRow.getCell(3).getStringCellValue();
			     
			     
			     driver.findElement(By.name("FullName")).sendKeys(FullName);
			     driver.findElement(By.name("Email")).sendKeys(Email);
			     driver.findElement(By.name("Country")).sendKeys(Country);
			     driver.findElement(By.xpath("//span[contains(text(),'What is Your Interest?')]")).click();
			     driver.findElement(By.xpath("//span[contains(text(),'Other')]")).click();
			     
			   
			     
			     Thread.sleep(1000);
				    
			 
			  } 

			   
				 }
			

	}


