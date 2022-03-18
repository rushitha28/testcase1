package githubdemo;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import orangehrmlibrary.Employee;
import orangehrmlibrary.LoginPage;

public class Testcase2 
{

	@Parameters({"fname","lname"})
	@Test
	public void checkemployeereg(String fname,String lname) throws InterruptedException
	{
		LoginPage lp=new LoginPage();
		lp.login("Admin", "Qedge123!@#");
		
		Employee emp=new Employee ();
		boolean res=emp.addemployee(fname, lname);
		Assert.assertTrue(res);
		lp.logout();

}
