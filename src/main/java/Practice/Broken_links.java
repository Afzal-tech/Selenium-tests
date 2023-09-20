package Practice;


import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.http.HttpConnection;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Broken_links {
	WebDriver driver;
	
	
	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebDriverWait wait= new WebDriverWait (driver, 30);
	}
	
	@Test
	public void Test1() {
		driver.get("https://housing.com/");
		List<WebElement> lists = driver.findElements(By.tagName("a"));
		System.out.println(lists.size());
		
	for(WebElement list: lists) {
		String url= list.getAttribute("href");
		verfiyUrl(url);
	}
		
		
		
	}

	public  void verfiyUrl(String url) {
		try {
		URL link = new URL(url);	
		HttpURLConnection httpurlconnection= (HttpURLConnection)link.openConnection();
		httpurlconnection.setConnectTimeout(3000);
		httpurlconnection.connect();
		
		if (httpurlconnection.getResponseCode()==200) {
			System.out.println(link +"--"+ httpurlconnection.getResponseMessage());}
			else {
				System.out.println(link +"--"+ httpurlconnection.getResponseMessage()+" broken");
				
			}
		
		
		
		}	
		catch(Exception e) {
			System.out.println("broken");
		}
	}
	

}
