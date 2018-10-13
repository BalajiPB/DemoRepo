package TestsampleBrowser.SampleBrowser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testNGsample {

	WebDriver driver; // creating driver instance

	@BeforeMethod
	public void setUp(){
		System.setProperty("webdriver.chrome.driver", "/Users/HP/workspace/driver/chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver(); // instance points to chrome driver
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("http://www.google.com");
	}

	@Test(priority=2,groups="one")
	public void googleTestTitle(){
		String title = driver.getTitle();
		System.out.println(title);
	}
	
	@Test(priority=1,groups="smoke")
	public void googleLogoTest(){
		boolean b = driver.findElement(By.xpath("//*[@id='hplogo']")).isDisplayed();
		Assert.assertFalse(b);
	}
	
	@Test(priority=3,groups="reg")
	public void mailLinkTest(){
		boolean b = driver.findElement(By.linkText("Mail")).isDisplayed();
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}




}
