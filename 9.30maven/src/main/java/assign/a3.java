package assign;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class a3 {
	ChromeDriver ob;
	@Test(priority=0)
		public void login() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ob= new ChromeDriver();
		ob.get("https://www.Facebook.com");
		
	}
	@Test(priority=1)
	public void div() {
		WebElement d = ob.findElementByTagName("div");
		System.out.println("Number of div :"+d.getSize());
		
	}
	@Test(priority=2)
	public void close() {
		ob.quit();
	}
	
		

}
