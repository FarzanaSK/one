package training;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class SetPractice {

	public static void main(String[] args) {

	/*	Set<String> set1 = new HashSet<>();
		
		set1.add("Farzana");
		set1.add("Zia");
		set1.add("Arshaan");
		System.out.println(set1.size());
		set1.add("Mumtaz");
		set1.add("Khader");
		System.out.println(set1.size());
		set1.add("Zia");
		
		for(String a:set1)
		{
			System.out.println(a);
		}
		
		//set1.remove("Farzana");
		set1.add("farzana");
		System.out.println("*************");
		
		for(String a:set1)
		{
			System.out.println(a);
		}
		
		//set1.clear();
		System.out.println(set1.isEmpty());
		
		*/
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/Window.html");
		
		driver.findElementByXPath("//button[text()='Open Multiple Windows']").click();
		
		Set<String> allwindows = driver.getWindowHandles();
		
	/*	for(String e:allwindows)
		{
			System.out.println(e);
		}*/
		
		List<String> lst = new ArrayList<>(allwindows);
		//System.out.println(lst);
		
		String string = lst.get(1);
		System.out.println(string);

		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());

		
		driver.switchTo().window("test");
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		
		
	}

}
