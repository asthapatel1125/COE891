package assignments;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;//utilizing Assert class in TestNG

public class Q3_GetTag_Facebook {
  
	private String baseUrl = "https://www.facebook.com";
	private String expectedTag;
	private String actualTag;
	private WebDriver driver;
	private WebElement element;
	
	@BeforeTest
	public void setUp()
	{
		//launch chrome browser
		System.setProperty("Webdriver.chrome.drive", "chromedriver.exe");
		this.driver = new ChromeDriver();
		driver.get(baseUrl);
	}

	@Test
	public void testGetTag()
	{
		expectedTag = "input";
		element = driver.findElement(By.name("email"));
		actualTag = element.getTagName();
		System.out.println(element.getTagName());
		Assert.assertEquals(actualTag, expectedTag);
		driver.close();
	}
	
}
