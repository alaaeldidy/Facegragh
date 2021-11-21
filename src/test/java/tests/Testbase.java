package tests;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import com.paulhammant.ngwebdriver.NgWebDriver;

public class Testbase {

	public WebDriver driver;
	public JavascriptExecutor jse;
	public NgWebDriver ngdriver;

	@Parameters({"browser"})
	@BeforeClass
	public void openurl(@Optional("chrome") String browsername)
	{
		if(browsername.equalsIgnoreCase("chrome"))
		{
			String path=System.getProperty("user.dir")+"/Drivers/chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", path);
			driver = new ChromeDriver();
		}
		if(browsername.equalsIgnoreCase("firefox"))
		{
			String path=System.getProperty("user.dir")+"/Drivers/geckodriver.exe";
			System.setProperty("webdriver.gecko.driver", path);
			driver = new FirefoxDriver(); 	
		}	
		
		driver.manage().window().maximize();
		driver.navigate().to("https://facegraphidqa.azurewebsites.net/Account/Login");
		/*
		 * JavascriptExecutor jse =(JavascriptExecutor) driver; ngdriver = new
		 * NgWebDriver(jse); ngdriver.waitForAngularRequestsToFinish();
		 * ngdriver.getLocationAbsUrl();
		 */

		
	}
	
	
	
	
	
	
	
	
	@AfterMethod
	public void getscreenshot(ITestResult result) throws IOException
	{
		
			TakesScreenshot ts= (TakesScreenshot) driver;
			 File Source=ts.getScreenshotAs(OutputType.FILE);
			 FileUtils.copyFile(Source, new File(".\\Screenshots\\"+result.getName()+".png"));
	}
	

	@AfterClass
	public void closeurl()
	{
	driver.quit();	
	}
	
	
	
	
	
	
	
	
}
