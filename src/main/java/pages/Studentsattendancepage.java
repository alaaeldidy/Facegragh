package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.paulhammant.ngwebdriver.ByAngular;
import com.paulhammant.ngwebdriver.ByAngularButtonText;


public class Studentsattendancepage extends Pagebase {

	public Select select;	
	
	public Studentsattendancepage(WebDriver driver) {
		super(driver);
		
	}

	@FindBy
	(xpath="/html/body/app-root/side-bar/div[1]/ng-sidebar-container/div/div/perfect-scrollbar/div/div[1]/section/div/div/app-children-attendance/div/div[1]/div/div/h3")
	public	WebElement successreport;
	

	
	@FindBy(xpath="/html/body/app-root/side-bar/div[1]/ng-sidebar-container/div/div/perfect-scrollbar/div/div[1]/section/div/div/app-children-attendance/div/div[3]/app-table/div/div/div/table/tbody/tr[1]/td[5]/div/a[1]/i")
		WebElement editbtn;
	
	
	
	public void useraddusernameinroom1() throws InterruptedException
	{
		Thread.sleep(4000);
		press(editbtn);
		Thread.sleep(4000);
	}
	

	
	
	
}
