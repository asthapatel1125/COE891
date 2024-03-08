package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Q4_LambdaTest {
	private String baseUrl = "https://lambdatest.github.io/sample-todo-app/";
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
	public void testFindItems()
	{
		driver.findElement(By.name("li2")).click();
		System.out.println("Second Item selected");
		driver.findElement(By.name("li4")).click();
		System.out.println("Fourth Item selected");
		element = driver.findElement(By.id("sampletodotext"));
		element.click();
		element.clear();
		element.sendKeys("your_name");
		driver.findElement(By.id("addbutton")).click();
	}
	
	/*
	@AfterTest
	public void finish()
	{
		driver.close();
	}*/
}
