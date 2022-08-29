package SeleniumModule4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataDrivenAssignment {

	public static void main(String[] args) throws IOException, InterruptedException {
    
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe"); //set the property of driver executable path

	 WebDriver driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().deleteAllCookies();
	        
	 driver.get("https://demo.guru99.com/V4/"); // to get the url
	        
	 FileInputStream file  = new FileInputStream("data/data1.xlsx"); //to read the data from excel sheet
	        
	 XSSFWorkbook workbook  = new XSSFWorkbook(file); //creating a workbook object
		    
     XSSFSheet sheet = workbook.getSheet("sheet1");//get first sheet from the workbook
		   // XSSFSheet sheet  = workbook.getSheetAt(0); // providing sheet index
		    
	 int noOfRows= sheet.getLastRowNum(); //get first row from the sheet
		    
		   
	  for(int row =1; row<=noOfRows; row++)
	  {
		    XSSFRow currentRow = sheet.getRow(row);  //focus on current row
		    	
		    String username = currentRow.getCell(0).getStringCellValue();    //get the value from cell
		    String password = currentRow.getCell(1).getStringCellValue();
	              
	        Thread.sleep(1000);
		        
		    driver.findElement(By.name("uid")).sendKeys(username);
		    driver.findElement(By.name("password")).sendKeys(password);
		    driver.findElement(By.name("btnLogin")).click();
		        
		     Thread.sleep(1000);
		        
		      //  driver.close();
		        
		       
		    		
		    	}
		    	
		    }
		 
		}



	      



	


