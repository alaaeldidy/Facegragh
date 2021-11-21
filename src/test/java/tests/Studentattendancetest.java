package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Homepage;
import pages.Signinpage;
import pages.Studentsattendancepage;

public class Studentattendancetest extends Testbase {

	
	public Signinpage Signinobj;	
	public	Homepage Homepobj;
	public Studentsattendancepage Studentsattendanceobj;
	
	@Test
	public void usersignintest() throws InterruptedException
	{
		Signinobj =new 	Signinpage(driver);
		Signinobj.usersignin("011416","123456");
		Homepobj=new Homepage(driver);
		Assert.assertEquals("Attendance Dashboard",Homepobj.successlogin.getText());
		Homepobj.pressonmanageattendance();
		Studentsattendanceobj = new Studentsattendancepage(driver);
		Assert.assertEquals("Manage Students Attendance",Studentsattendanceobj.successreport.getText());
		Thread.sleep(3000);
	}
		
	@Test
	public void useraddstudent() throws InterruptedException
	{
		
		Studentsattendanceobj = new Studentsattendancepage(driver);
		Studentsattendanceobj.useraddusernameinroom1();
		Thread.sleep(3000);
	}
	
	
	
	
}
