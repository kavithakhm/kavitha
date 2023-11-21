package assign;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class a1 {
	ChromeDriver ob;
	@Test(priority=0)
	public void slider() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ob= new ChromeDriver();
		ob.get("https://jqueryui.com/slider/");
	}
		@Test(priority=1)
		public void action() throws InterruptedException {
		ob.switchTo().frame(0);
		Actions ac= new Actions(ob);
		WebElement ele = ob.findElementById("slider");
		ac.dragAndDropBy(ele, 40, 0).build().perform();
		Thread.sleep(3000);
		}
		@Test(priority=2)
		public void close() {
			ob.quit();
		}
		
	}

