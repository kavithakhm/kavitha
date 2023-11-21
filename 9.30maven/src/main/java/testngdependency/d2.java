package testngdependency;

import org.testng.annotations.Test;

public class d2 {
	@Test(priority=0,groups="L")
	public void visit() {
		System.out.println("visiting the website");
	}
	@Test(priority=1,groups="L")
	public void login() {
		System.out.println("login the website");
	}
	@Test(priority=2,dependsOnGroups="L")
	public void pass() {
		System.out.println("password");
	}
}
