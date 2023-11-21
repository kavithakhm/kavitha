package testngdependency;

import org.testng.annotations.Test;

public class d1 {
	//dependsonmethods:create a connection between testcases
	@Test(priority=0)
	public void visit() {
		System.out.println("visiting the website");
	}
	@Test(priority=1,dependsOnMethods="visit")
	public void login() {
		System.out.println("login the website");
	}

}
