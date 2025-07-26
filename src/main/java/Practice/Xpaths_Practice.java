package Practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;



public class Xpaths_Practice {
	
	public XSSFWorkbook wb;
	public XSSFSheet sheet;
	public XSSFRow row;
	public XSSFCell col;
	
	
	WebDriver driver;
	
	
	@Test(priority=1)
	public Object [][] read_data(String filepath, String sheet_name) throws FileNotFoundException {

		String[][] tab_array=null;
		try {
			FileInputStream file = new FileInputStream("/Selenium_Tests/Test-data/GMTestData.xlsx");
		XSSFWorkbook wb=  new XSSFWorkbook(file);
		XSSFSheet sheet = wb.getSheet("REGISTRATION");
		XSSFRow row = sheet.getRow(0);
		XSSFCell cell = row.getCell(0);
		
		
		int total_row = sheet.getLastRowNum();
		
		System.out.println(cell);
		
		
		
		
		return tab_array;
		}
		
		
		
		catch(FileNotFoundException e) {
			System.out.println("file not there");
			e.printStackTrace();	
		}
		
		catch(IOException e) {
			System.out.println("file not there");
			e.printStackTrace();	
		}
		
		return tab_array;
	}
	
	@Test(priority=2)
	public void xpaths() {
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions options = new ChromeOptions();
		driver = new ChromeDriver(options);
		//options.addArguments("start-maximized");
		//options.addArguments("--disable-notifications");
		//options.addArguments("--headless");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//WebDriverWait  wait = new WebDriverWait(driver, 20);
		
		driver.get("https://www.umaryland.edu/cpa/toolbox/website-manual/");
		
		
		
		}
	
	
	
	
	@AfterMethod
	public void quit() {
		//driver.quit();
	}
	
	

}
