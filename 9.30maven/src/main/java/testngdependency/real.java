package testngdependency;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class real {
	ChromeDriver ob;
	@Test(priority=0,description="visiting mycontactform",groups="L")
	public void visit() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ob= new ChromeDriver();
		ob.get("http://www.mycontactform.com");
		
	}
	@Test(priority=1,description="maximising",groups="L")
	public void max() {
		ob.manage().window().maximize();
	}
	@Test(priority=2,description="refreshing",groups="L")
	public void refresh() {
		ob.navigate().refresh();
	}
	@Test(priority=3,description="login",dependsOnGroups="L")
	public void login() {
		ob.findElementById("user").sendKeys("Dhivyakarthi123");
		ob.findElementByName("pass").sendKeys("12345");
		ob.findElementByClassName("btn_log").click();
	}
	@Test(priority=4,description="closing",dependsOnGroups="L")
	public void close() throws InterruptedException {
		Thread.sleep(2000);
		ob.quit();
	}

}
