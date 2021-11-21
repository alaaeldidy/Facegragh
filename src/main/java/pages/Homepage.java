package pages;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import com.paulhammant.ngwebdriver.ByAngular;
import com.paulhammant.ngwebdriver.ByAngularButtonText;
import com.paulhammant.ngwebdriver.ByAngularModel;
import com.paulhammant.ngwebdriver.NgWebDriver;





public class Homepage extends Pagebase{

	public Actions actions;
	public JavascriptExecutor jse;
	public NgWebDriver ngdriver;

	public Homepage(WebDriver driver) {
		super(driver);
	}

	//locators
	@FindBy(xpath ="/html/body/app-root/side-bar/div[1]/ng-sidebar-container/div/div/perfect-scrollbar/div/div[1]/section/div/div/dashboard/div[2]/div[1]/div/div[1]/div/div/h3")
	public	WebElement successlogin;	

	 @FindBy(xpath="//*[@id=\"sidebarNavigation\"]/aside/perfect-scrollbar/div/div[1]/div/div/div[2]/nav/ul/li[8]/a/p/span")
	  WebElement manage;
	                 
	  @FindBy(xpath="//*[@id=\"sidebarNavigation\"]/aside/perfect-scrollbar/div/div[1]/div/div/div[2]/nav/ul/li[8]/ul/li[2]/a/p")
	  WebElement students;
	
	 
	  
	public void pressonmanageattendance() throws InterruptedException
	{
		//click on Manage Attendance
		Thread.sleep(4000);
		press(manage);
		
		//Scroll Down
	    Thread.sleep(4000);
		Actions act = new Actions(driver);
		act.sendKeys(Keys.PAGE_DOWN).build().perform(); 
		
		//press on students
		Thread.sleep(4000);
		press(students);
	
		
		
		
		
		}





}


