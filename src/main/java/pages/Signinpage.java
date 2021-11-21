package pages;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;


public class Signinpage extends Pagebase {

	
	public Actions action;
	
	public Signinpage(WebDriver driver) {
		super(driver);
	
	}

	@FindBy(id ="Username")
	WebElement usernametxt;
	
	
	@FindBy(id ="Password")
	WebElement passtxt;
	
	@FindBy(id ="AutoVerificationCode")
	WebElement verificationcode;
	
	@FindBy(id ="btnSubmit")
	WebElement submitbtn;
	
	@FindBy(xpath="/html/body/div[1]/span[2]/a")
	WebElement redirecttoportallink;
	
	
	
	
	public void usersignin(String name,String pass) throws InterruptedException
	{
	
		
		write(usernametxt, name);
		write(passtxt, pass);
		press(verificationcode);
		press(submitbtn);
	    driver.manage().timeouts().implicitlyWait(4000,TimeUnit.MILLISECONDS);
		Actions actions = new Actions(driver);
		actions.moveToElement(redirecttoportallink).click().perform();
		Thread.sleep(3000);
		
	}
	
	
	
}
