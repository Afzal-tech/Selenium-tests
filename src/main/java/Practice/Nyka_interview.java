package Practice;

import java.util.concurrent.TimeUnit;

import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Nyka_interview {
	// contains test page of nYkaa, with mentiones cases on page
	//https://practicetestautomation.com/practice-test-login/

	WebDriver driver;
	
	
	@BeforeTest
	public void setup() {
		// handling driver versions
		//WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver","/Applications/Google Chrome.app/Contents/MacOS/Google Chrome");
		//Instantiating  driver with options
		ChromeOptions options =new ChromeOptions();
		driver = new ChromeDriver(options);
		options.addArguments("--disable-notifications");
		
		//driver .manage().window().maximize();   // maximizing window
		
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  // implicit wait
		
		WebDriverWait  wait = new WebDriverWait(driver,30);// explicit wait
		
		Actions actions= new Actions(driver);  // instance of action class
		JavascriptExecutor js = (JavascriptExecutor)driver;  //scroll 
		
		
		SoftAssert soft = new SoftAssert(); // instance for soft assert
		
		
	}


	@Test(enabled= false)
	public void login() throws InterruptedException {
	
		driver.get("https://practicetestautomation.com/practice-test-login/");

		String username = "student";
		String password ="Password123";


		driver.findElement(By.xpath("//input[@id= 'username']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id= 'password']")).sendKeys(password);
		driver.findElement(By.xpath("//button[@id= 'submit']")).click();
		Thread.sleep(2000);
		String expectedURL=driver.getCurrentUrl();
		String actualURL= "practicetestautomation.com/logged-in-successfully/";
		
		if (expectedURL.contains(actualURL)) {
			System.out.println("URL is matched");}
			else {
				System.out.println("URL not matched");}
	
		SoftAssert soft = new SoftAssert();
		soft.assertEquals(expectedURL, actualURL,  "url verified"); // soft assert 

     	Assert.assertEquals(expectedURL, actualURL, "it matched"); // hard assert


		
		String expected=driver.findElement(By.xpath("//*[text()='Congratulations student. You successfully logged in!']")).getText();
		
		soft.assertEquals(expected, "Congratulations student. You successfully logged in!");
		//soft.assertAll();   // used to print all failures of soft assert on console
		
		
		Thread.sleep(2000);

	WebElement element=	driver.findElement(By.xpath("//a[text()= 'Log out']"));
	
	if (element.isDisplayed()) {
		element.click();
		System.out.println("logout Successful");
	}


	}
	@Test
	public void  incorrect_username_or_password() {
		
		driver.get("https://practicetestautomation.com/practice-test-login/");

		String username = "student";
		String password ="Password123";


		driver.findElement(By.xpath("//input[@id= 'username']")).sendKeys("student");
		String entered_username=driver.findElement(By.xpath("//input[@id= 'username']")).getAttribute("value");//will give value of username
		System.out.println(entered_username);
		
		driver.findElement(By.xpath("//input[@id= 'password']")).sendKeys("afzal");
		String entered_password = driver.findElement(By.xpath("//input[@id= 'password']")).getAttribute("value");//will give value of password 
		System.out.println(entered_password);
		
		driver.findElement(By.xpath("//button[@id= 'submit']")).click();
		
		
		
		
		Boolean  user=driver.findElement(By.xpath("//*[text()='Your username is invalid!']")).isDisplayed();
		Boolean  passwd=driver.findElement(By.xpath("//*[text()='Your password is invalid!']")).isDisplayed();
		
		String invaliduname_text=  driver.findElement(By.xpath("//*[text()='Your username is invalid!']")).getText();
		String invalidpassword_text=driver.findElement(By.xpath("//*[text()='Your password is invalid!']")).getText();
		
		if (entered_username.equals(username));
		else{
			System.out.println("String verfification   "+invaliduname_text);// logic 1  to verify incorrect username and password
		}
		if (entered_password.equals(password));
		else {
				System.out.println("String verfification   "+invalidpassword_text);
			}
		
			
		
		if (user) {
			System.out.println("bool  "+invaliduname_text);// logic 2 for incorrect usrname and pasword
		}
		if (passwd) {
			System.out.println("bool  "+invalidpassword_text);
		}
	}  
	@AfterTest
	public void teardown() {
		driver.quit();
	}
}
