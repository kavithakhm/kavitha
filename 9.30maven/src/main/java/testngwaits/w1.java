package testngwaits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class w1 {
	@Test()
	public void face() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Desktop\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver ob= new ChromeDriver();
		ob.get("http://www.google.com");
		ob.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		System.out.println(ob.getTitle());//5
		System.out.println(ob.getCurrentUrl());//5
		ob.navigate().refresh();//5
		ob.findElementByLinkText("Images");//5
		ob.quit();
	}
}
