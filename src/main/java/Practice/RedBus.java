package Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RedBus {
	
	WebDriver driver;
	
	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
	//	WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver,30);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		
		
		
	}
	@Test(groups= {"demo"})
	public void test1() {
		driver.get("https://www.redbus.in/");
		
	driver.findElement(By.xpath("//*[@class=\"sc-bxivhb hrsLPT\" and @id='src']")).sendKeys("Delhi");
	driver.findElement(By.xpath("//*[@class=\"sc-bxivhb hrsLPT\" and @id='dest']")).sendKeys("Chandigarh");
	driver.findElement(By.xpath("//*[@class= 'sc-cSHVUG NyvQv icon icon-datev2']")).click();
	driver.findElement(By.xpath("//*[text()= '29']")).click();
	
	
	
		
	}
	
	
	

}
