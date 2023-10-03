package test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Day1 {
	
	
	@AfterTest
	public void lastexecution() {
		System.out.println("I will execute last");
	}

	@Test
	public void Demo() {
		System.out.println("Hello");
		System.out.println("Hi");
		}
	
	@AfterSuite
	public void afSyite()
	{
		System.out.println("Im the no one from last");
	}
	
	@Test
	public void SecondTest() {
		System.out.println("bye");
	}
}
