package testngwaits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ex {
	@Test()
	public void face() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Desktop\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver ob= new ChromeDriver();
		ob.get("http://www.google.com");
	
	WebDriverWait w= new WebDriverWait(ob,5);
	
	//title
	//w.until(ExpectedConditions.titleIs("Google"));
	
	//w.until(ExpectedConditions.titleContains("oo"));
	
	//alert
	//w.until(ExpectedConditions.alertIsPresent());
	
	//visbility of an element
	// finding the element and checking its visibility
	//w.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Images")));
	
	//visibility of more elements
	//collecting all the images and checking its visibility
	//w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.tagName("img")));
	
	//element to be clickable
	//finding the element and checking whether it is clickable or not
   w.until(ExpectedConditions.elementToBeClickable(By.linkText("Privacy")));
	
	ob.quit();
}


}
