package tests;



import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Homepage;
import pages.Signinpage;
import pages.Studentsattendancepage;

public class Signintest extends Testbase {

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
	
	
}
	
	
	
	
	
}
