package intro;

import org.testng.annotations.Test;

public class c2 {
	@Test(priority=0,description="First method",groups="kavi",invocationCount=2,enabled=false)
	public void m1()
	{
		System.out.println("Test case 1");
		}

	@Test(priority=1,description="Second method",groups="pugal",invocationCount=2)
	public void ab()
	{
		System.out.println("Test case 2");
		}

	@Test(priority=2,description="Third method",groups="kavi")
	public void m2()
	{
		System.out.println("Test case 3");
		}

}
