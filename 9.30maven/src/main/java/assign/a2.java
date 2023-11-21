package assign;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class a2 {
	ChromeDriver ob;
	@Test(priority=0,description="google page")
	public void gl() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ob= new ChromeDriver();
		ob.get("https://www.google.com");
	}
		@Test(priority=1)
		public void img() {
			WebElement i = ob.findElementByTagName("img");
			System.out.println("Number of images is : "+i.getSize());
		}
		@Test(priority=2)
		public void close() {
			ob.quit();
		}
}
