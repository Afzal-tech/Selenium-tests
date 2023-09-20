package Practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alert_Handling {
	
	WebDriver driver;
	//
	
	@Test(priority=-5)
	public void alert_handling_simple() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions options =new ChromeOptions();
		driver = new ChromeDriver(options);
		options.addArguments("--disable-notifications");
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
//		driver.findElement(By.id("alertButton")).click();
//		Alert simple = driver.switchTo().alert();
//		Thread.sleep(2000);
//		simple.accept();		
		
	}
	
	@Test(priority=2)
	public void alert_handling_with_wait() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver,30);
		driver.findElement(By.id("timerAlertButton")).click();
		wait.until(ExpectedConditions.alertIsPresent());
		Alert simple = driver.switchTo().alert();
		Thread.sleep(2000);
		simple.accept();
		
		
	}
	@Test(priority=3)
	public void alert_handling_ok() throws InterruptedException {
		//WebDriverWait wait = new WebDriverWait(driver,30);
		driver.findElement(By.id("confirmButton")).click();
		//wait.until(ExpectedConditions.alertIsPresent());
		Alert simple = driver.switchTo().alert();
		Thread.sleep(2000);
		simple.accept();
			
	}
	
	@Test(priority=0)
	public void alert_handling_text() throws InterruptedException {
		//WebDriverWait wait = new WebDriverWait(driver,30);
		driver.findElement(By.id("promtButton")).click();
		//wait.until(ExpectedConditions.alertIsPresent());
		Alert simple = driver.switchTo().alert();
		
		simple.sendKeys("Afzal");
		System.out.println(simple.getText());
		Thread.sleep(2000);
		simple.accept();
			
	}
	
	
	
	
	
	
	@AfterTest
	public void teardown() {
		driver.close();
	}
	

}
