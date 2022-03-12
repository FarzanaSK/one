package training;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class erailtable {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://erail.in/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement sortele = driver.findElementById("chkSelectDateOnly");
		
		if(sortele.isSelected())
		{
			sortele.click();
		}
		
		
		WebElement fromstn = driver.findElementById("txtStationFrom");
		fromstn.clear();
		fromstn.sendKeys("SBC",Keys.TAB);
		
		WebElement tostn = driver.findElementById("txtStationTo");
		tostn.clear();
		tostn.sendKeys("MAS",Keys.TAB);
		
		//find table webelement
		
		WebElement table1 = driver.findElementByXPath("//table[@class = 'DataTable TrainList TrainListHeader']");
		List<WebElement> AllRows = table1.findElements(By.tagName("tr"));
		int rowcount = AllRows.size();
		System.out.println(rowcount);
		
		
		WebElement FirstRow = AllRows.get(0);
		List<WebElement> Columns = FirstRow.findElements(By.tagName("td"));
		int columncount = Columns.size();
		
		System.out.println(columncount);
		
		WebElement sec_col = Columns.get(1);
		
		System.out.println(sec_col.getText());
		
		for(int i =0;i<=rowcount;i++)
		{
			WebElement row = AllRows.get(i);
			List<WebElement> cols = row.findElements(By.tagName("td"));
			WebElement seccol = cols.get(1);
			String text = seccol.getText();
			System.out.println(text);
			
			
			
		}
		
		
		
		
		
		
	}

}
