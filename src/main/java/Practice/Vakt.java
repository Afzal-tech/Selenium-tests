package Practice;


import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Vakt {
	
	WebDriver driver;
	
	
	@BeforeTest
	public void setup() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options= new ChromeOptions();
		driver = new ChromeDriver(options);
		options.addArguments("--disable-notifications");
		driver.manage().window().maximize();
		
		


	}
	public void Screenshot( String str) throws IOException {
		UUID uuid = UUID.randomUUID();
		TakesScreenshot scrnshot= (TakesScreenshot)driver;
		File src = scrnshot.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File ("./reports"+str+uuid+".png"));
	}
}


