package Academy;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class BrowserTest {

	
	@Test
	public void getData()
	{
		System.out.println("Hello for testing nodeserver");
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://nodeserverguarito.azurewebsites.net/");
		String text =driver.findElement(By.cssSelector("h1")).getText();
		System.out.println(text+" compare with express");
		Assert.assertTrue(text.equalsIgnoreCase("Express"));
		driver.close();
	
		
		
	}
}
