package TestsampleBrowser.SampleBrowser;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class test {

	@BeforeSuite
	public void setUP(){
	System.out.println("system property for chrome");
	
	}
	
	@BeforeClass
	public void launchbrowser(){
		System.out.println("launch browser");
	}
	
	@BeforeMethod
	public void enterURL(){
		System.out.println("enter URL");
	}
	
	@BeforeTest
	public void login(){
		System.out.println("login successful");
	}

	@Test
	public void googelTitleTest(){
		System.out.println("ggoogle test");
	}

	@AfterMethod
	public void logout(){
		System.out.println("logout from app");
	}

	@AfterTest
	public void deleteAllCookies(){
		System.out.println("del cookies");
	}

	@AfterClass
	public void closeBrowser(){
		System.out.println("clsoebroser");
	}
	
	@AfterSuite
	public void generateTestReport(){
		System.out.println();
	}

}
