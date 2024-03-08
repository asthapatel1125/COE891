package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Q7_Login {
	private WebDriver driver;
	private String baseUrl = "https://www.facebook.com/";
	
	@BeforeTest
	public void setUp()
	{
		//launch chrome browser
		System.setProperty("Webdriver.chrome.drive", "chromedriver.exe");
		this.driver = new ChromeDriver();
		driver.get(baseUrl);
	}
	
	@Test
	public void testLogin()
	{
		// Locate username, password, and login button elements
        WebElement emailInput = driver.findElement(By.id("email"));
        WebElement passwordInput = driver.findElement(By.id("pass"));
        WebElement loginButton = driver.findElement(By.name("login"));
     // Enter your Facebook credentials
        emailInput.sendKeys("username");
        passwordInput.sendKeys("password");
        
     // Click on the login button
        loginButton.click();

        // Wait for a while to ensure the page is loaded
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Verify the successful login by checking the URL
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "https://www.facebook.com/?sk=welcome";
        System.out.println(actualUrl);
        Assert.assertEquals(actualUrl, expectedUrl);

        System.out.println("Login successful. Current URL: " + actualUrl);
	}
	
	/*@AfterTest
	public void finish()
	{
		driver.quit();
	}*/
}
