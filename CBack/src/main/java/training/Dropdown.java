package training;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		
		driver.manage().window().maximize();
		
		WebElement ddele = driver.findElementById("dropdown1");
		//convert webelement to dropdown 		
		Select dd = new Select(ddele);
	//	dd.selectByVisibleText("Selenium");
		
		//dd.selectByValue("2");
		
	//	dd.selectByIndex(4);
		
		List<WebElement> options = dd.getOptions();
		
		for (int i = 0; i < options.size(); i++) {
			//System.out.println(i);
			System.out.println(options.get(i).getText());
			
		}
		
		
		
		
		
		


	}

}
