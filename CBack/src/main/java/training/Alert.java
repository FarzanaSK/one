package training;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Alert {
		
		@Test
		public void Alert() {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.navigate().to("http://www.leafground.com/pages/frame.html");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	/*	driver.findElementByXPath("//button[text()='Alert Box']").click();
		String text = driver.switchTo().alert().getText();
		System.out.println(text);
		
		driver.switchTo().alert().accept();		
		
		System.out.println(driver.getTitle());
		*/
		
		
		//driver.switchTo().frame(0);
		
		
		WebElement frame = driver.findElementByXPath("//iframe[@src='default.html']");
		driver.switchTo().frame(frame);
		driver.findElementById("Click").click();
		
		driver.switchTo().defaultContent();
		String text = driver.findElementByClassName("wp-heading").getText();
		System.out.println(text);
	}

}
