package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day3 {
	
	@BeforeClass
	public void befoclas()
	{
		System.out.println("before executing any methods in the class");
	}
	

	@Test
	public void WebloginCarLoan()
	{
		System.out.println("weblogincar");
	
	}
	
	@Parameters({"URL","APIKey"})
	@Test
	public void WebloginCarLoans(String urlname, String key)
	{
		System.out.println("weblogincar");
		System.out.println(urlname);
		System.out.println(key);
	}
	
	@BeforeMethod
	public void beforeevery()
	{
		System.out.println("I will execute before every test method in day 3 class");
	}
	
	@AfterMethod
	public void afterevery()
	{
		System.out.println("I will execute after every test method in day 3 class");
	}
	
	@AfterClass
	public void afterclas()
	{
		System.out.println("After executing all methods in the class");
	}
	
	@Test(groups= {"Smoke"})
	public void MobileLogincarLoan()
	{
		System.out.println("Mobilelogincar");
	}
	
	@BeforeSuite
	public void Bfsuite() {
		System.out.println("I'm no one");
	}
	
	
	@Test(enabled=false)
	public void MobilesignincarLoan()
	{
		System.out.println("Mobile SIGNIN");
	}
	
//	@Test(timeOut=4000)
//	public void MobilesignoutcarLoan()
//	{
//		System.out.println("Mobile SIGNOUT");
//	}
//	
//	
//	
//	@Test(dependsOnMethods= {"WebloginCarLoan","MobilesignoutcarLoan"})
//	public void LoginAPIcarLoan()
//	{
//		System.out.println("APIlogincar");
//	}
	
	@Test(dataProvider="getData")
	public void Mobilesignotloan(String username, String password)
	{
		System.out.println("Mobile sig out");
		System.out.println(username);
		System.out.println(password);
		
	}
	
	@DataProvider
	public Object[][] getData() {
		
		//1st combination - username password
		//2nd   username password - no credit history
		//3rd fraudelent credit history
		
		Object[][] data = new Object[3][2];
		
		//1st set
		data[0][0]= "firstsetusername";
		data[0][1]="firstpassword";
		//columns in the row are nothing but values for the particular combination(row)
		
		
		//2nd set
		data[1][0]="secondsetusername";
		data[1][1]="secondpassword";
		
		//3rd set
		data[2][0]="thirdsetusername";
		data[2][1]="thirdpassword";
		return data;
		
	}

}
