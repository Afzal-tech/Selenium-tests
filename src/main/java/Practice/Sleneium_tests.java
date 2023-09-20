package Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sleneium_tests {
	
	WebDriver driver;
	
	
	// setTimeout(()=>{debugger}, 5000)   //.. use this for locator of popup elements

	@Test
	public void test() throws InterruptedException {
		WebDriverManager.chromedriver().setup(); // to remove the driver dependency
		System.out.println("hello");
		//System.setProperty("webdriver.chrome.driver", "chromedriver");
		driver = new ChromeDriver();
		driver.get("https://blazedemo.com/");
	driver .navigate().refresh();
	
		 WebElement element=driver.findElement(By.xpath("//*[@name='fromPort']"));
		

		 
		 Select dropdown = new Select(element);  
		dropdown.selectByIndex(1); 
		String value = dropdown.getFirstSelectedOption().getText();
			System.out.println("Selected lead is " +value);
		List<WebElement> list = dropdown.getOptions();
		System.out.println("There are " +(list.size()-1)+ " types of leads as follows");
		
		ArrayList<String> list1 = new ArrayList <String>();
		
		for (int i=1; i<list.size(); i++)
		{ list1.add(list.get(i).getText());	
		}
		Collections.sort(list1);
		System.out.println(list1);
		
		
	}

	@AfterTest
	public void teardown()

	{ driver.quit();

	}

	}


