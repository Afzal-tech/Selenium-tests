package Practice;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Nykaa {
	WebDriver driver;
	


	@Test
	public void add_to_cart() throws InterruptedException {
		WebDriverManager.chromedriver().setup();


		driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  // implicit wait
		
		WebDriverWait  wait = new WebDriverWait(driver,30);// explicit wait
		
		Actions actions= new Actions(driver);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		
		
		
		
		
		driver.get("https://www.nykaa.com/lakme-9-to-5-naturale-matte-sticks-lipstick-crimson-town-299527/p/299527");
		System.out.println(driver.getTitle());
		createScreenshot("homes");


 		driver.findElement(By.xpath("(//span[@class='mkr-New-Shopping-Bag font-mkr']/..)[01]")).click();
		WebElement element = driver.findElement(By.xpath("(//*[text()='Lakme 9 to 5 Naturale Day Creme SPF 20 With Pure Aloe Vera'])"));
		js.executeScript("arguments[0].scrollIntoView()",element);
		
		System.out.println("test");
		Thread.sleep(5000);
		createScreenshot("home");
		
		actions.moveToElement(element).build().perform();
		System.out.println("test2");
		WebElement e1;
		//driver.findElement(By.xpath("(//*[@class= 'mkr-New-Shopping-Bag font-mkr']/..)[3]"));
		e1=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class= 'mkr-New-Shopping-Bag font-mkr']/..)[3]")));
		e1.click();
		
		js.executeScript("window.scrollTo(0,0)");
		
		System.out.println("test3");
		
		driver.findElement(By.xpath("//*[@alt ='Lakme 9 to 5 Naturale Day Creme SPF 20 With Pure Aloe Vera']")).click();
		System.out.println("test4");
		driver.findElement(By.xpath("//div[@class='AddBagIcon']")).click();
		
		
		
		List<WebElement> elements  =driver.findElements(By.xpath("//div[@class='product-name']"));
		
		for(WebElement a:elements)
			if(elements.size()>0)
			
		{  String productName=a.getText();
		System.out.println("Name "+productName);
		}
		
		Thread.sleep(2000);
		String mainwindow= driver.getWindowHandle();
		
		Set<String> allwindows = driver.getWindowHandles(); 
		Iterator<String> i= allwindows.iterator();
		
		System.out.println(allwindows); 
		System.out.println("a1"); 
		for (String window : allwindows) 
		{ if(!mainwindow.equalsIgnoreCase(window)) {
		    driver.switchTo().window(window);
		    
		    System.out.println("child "+ driver.getTitle());
		     }
		}


	}
	@AfterTest
	public void teardown() {
		System.out.println("closing");
		//driver.close();
	}
	
	public String createScreenshot(String str) {
		UUID uuid = UUID.randomUUID();
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(scrFile,  new File ("./Reports/"+str+ uuid+".png"));
		} catch (IOException e) {
			System.out.println("error");
		}
			
		return "./Screenshots/" + uuid + ".png";
	}
	
	
	
	
	
	
	
	
	
}
