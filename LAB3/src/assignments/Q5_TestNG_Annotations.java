package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Q5_TestNG_Annotations {
	private String baseUrl = "https://www.google.ca/";
	private WebDriver driver;
	private WebElement element;

	@BeforeTest
	public void setUp()
	{
		//step 1: launch chrome browser
		System.setProperty("Webdriver.chrome.drive", "chromedriver.exe");
		this.driver = new ChromeDriver();
		//step 2: launch Google
		driver.get(baseUrl);
	}
	
	@Test(priority = 0)
	public void findFacebook()
	{
		//step 3 : search Facebook
		driver.findElement(By.xpath(".//*[@title='Search']")).sendKeys("Facebook");
	}
	
	@Test(priority = 1)
	public void verifyItsFacebook()
	{
		driver.findElement(By.xpath("//input[@name='btnK']")).click();						
        Assert.assertEquals(driver.getTitle().contains("Facebook - Google Search"), true);	
	}
	
	@AfterTest
	public void finish()
	{
		driver.close();
	}
	
	/*
	@Test(priority = 1)
	public void test()
	{
		//step 1: launch chrome browser
		System.setProperty("Webdriver.chrome.drive", "chromedriver.exe");
		this.driver = new ChromeDriver();
	}
	
	@Test(priority = 2)
	public void openGoogle()
	{
		//step 2: launch Google
		driver.get(baseUrl);
	}
	
	@Test(priority = 3)
	public void findFacebook()
	{
		//step 3 : search Facebook
		driver.findElement(By.xpath(".//*[@title='Search']")).sendKeys("Facebook");
	}
	
	@Test(priority = 4)
	public void verifyItsFacebook()
	{
		 driver.findElement(By.xpath(".//*[@value='Search']")).click();							
	     Assert.assertEquals(driver.getTitle().contains("Facebook - Google Search"), "Facebook - Google Search");		
	}
	
	@Test(priority = 5)
	public void finish()
	{
		driver.close();
	}*/
}
