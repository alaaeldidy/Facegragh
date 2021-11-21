package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.paulhammant.ngwebdriver.NgWebDriver;




public class Pagebase {

	public  WebDriver driver;
	public JavascriptExecutor jse;
	public WebDriverWait wait;
	public NgWebDriver ngdriver;
	    
	public	Pagebase(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		wait=new WebDriverWait(driver,60);
	}
	public NgWebDriver getNGdriver()
	{
		JavascriptExecutor jse =(JavascriptExecutor) driver;
		return (new NgWebDriver(jse));
		
	}
	public void waitforangularrequeststofinish()
	{
		 {
			getNGdriver().waitForAngularRequestsToFinish();
		 {
		
		}
	}
	
	
}
	
	public void press(WebElement ele)
	{	
	ele.click();	
	}
	public void write(WebElement ele,String txt)
	{	
	ele.sendKeys(txt);	
	}
	public void clear(WebElement ele)
	{
		ele.clear();
	}
	
	protected void ScrollDown()
	{
		jse.executeScript("ScrollBy(0,4000)");	
	}
	
	
	
}
