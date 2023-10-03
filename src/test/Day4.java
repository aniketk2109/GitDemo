package test;

import org.testng.annotations.Test;

public class Day4 {
	
	
	@Test
	public void WebloginHomeLoan()
	{
		System.out.println("webloginhome");
	}
	
	@Test(groups= {"Smoke"})
	public void MobileLoginHomeLoan()
	{
		System.out.println("MobileloginHome");
	}
	
	@Test
	public void LoginAPIHomeLoan()
	{
		System.out.println("APIloginHome");
	}

}
