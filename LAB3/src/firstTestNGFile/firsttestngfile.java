package firstTestNGFile;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;//utilizing Assert class in TestNG
import org.testng.annotations.*;//utilizing annotations in TestNG

public class firsttestngfile {
	
	public String baseUrl = "http://demo.guru99.com/test/newtours/";
    public WebDriver driver;
    String expected;
    String actual;

    @BeforeTest
    public void launchBrowser() {
        System.out.println("launching chrome browser");
		System.setProperty("Webdriver.chrome.drive", "chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(baseUrl);
    }

    @BeforeMethod
    public void verifyHomepageTitle() {
        String expectedTitle = "Welcome: Mercury Tours";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
    }

    @Test(priority = 0)
    public void register() {
        driver.findElement(By.linkText("REGISTER")).click();
        expected = "Register: Mercury Tours";
        actual = driver.getTitle();
        Assert.assertEquals(actual, expected);
    }

    @Test(priority = 1)
    public void support() {
        driver.findElement(By.linkText("SUPPORT")).click();
        expected = "Under Construction: Mercury Tours";
        actual = driver.getTitle();
        Assert.assertEquals(actual, expected);
    }

    @AfterMethod
    public void goBackToHomepage() {
        driver.findElement(By.linkText("Home")).click();
    }

    @AfterTest
    public void terminateBrowser() {
        driver.close();
    }
}