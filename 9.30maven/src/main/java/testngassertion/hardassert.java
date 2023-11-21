package testngassertion;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class hardassert {
	@Test
	public void hs()
	{
		System.setProperty("webdriver.chrome.driver" , "C:\\Users\\LENOVO\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		 ChromeDriver ob = new ChromeDriver();
		ob.get("http://www.google.com");
		Assert.assertEquals(ob.getTitle(), "Google");
	   // Assert.assertNotEquals(ob.getTitle(),"Google");
		ob.quit();
	}

}
