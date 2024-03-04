package assignments;

import org.testng.annotations.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;//utilizing Assert class in TestNG
import org.testng.annotations.*;//utilizing annotations in TestNG

public class Q2_GetTitle {
	
	public String baseUrl = "http://demo.guru99.com/test/newtours/";
    public WebDriver driver;
    String expectedTitle;
    String actualTitle;
    
    @Test
    public void getTitle()
    {
    	//launch chrome browser
		System.setProperty("Webdriver.chrome.drive", "chromedriver.exe");
    	driver = new ChromeDriver();
    	driver.get(baseUrl);
    	String expectedTitle = "Welcome: Mercury Tours";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
        System.out.println("Web Page Title: " + driver.getTitle());
        driver.close();
    }
}
