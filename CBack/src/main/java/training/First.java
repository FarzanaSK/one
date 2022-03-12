package training;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class First {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
	
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
		String title = driver.getTitle();
		System.out.println(title);
		
		WebElement eleid = driver.findElementById("username");
		eleid.sendKeys("DemoSalesManager");
		
		WebElement elepwd = driver.findElementById("password");
		elepwd.sendKeys("crmsfa");
		
		WebElement eleclass = driver.findElementByClassName("decorativeSubmit");
		eleclass.click();
		
		driver.findElementByLinkText("CRM/SFA").click();
		
		driver.findElementByLinkText("Leads").click();
		
		driver.findElementByLinkText("Create Lead").click();
		
		driver.findElementById("createLeadForm_companyName").sendKeys("FIS Global");
		
		driver.findElementById("createLeadForm_firstName").sendKeys("Farzana");
		
		driver.findElementById("createLeadForm_lastName").sendKeys("Sheik");
		
		//driver.findElementByClassName("smallSubmit").click();
		
		WebElement elesource = driver.findElementById("createLeadForm_dataSourceId");
		Select src = new Select(elesource);
		src.selectByVisibleText("Partner");
				
		
		
		
		
		
		
	}

}
