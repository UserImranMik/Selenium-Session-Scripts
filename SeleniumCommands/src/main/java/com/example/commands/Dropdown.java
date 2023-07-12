package com.example.commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	
	public static void main (String args []) throws InterruptedException {

	ChromeOptions options = new ChromeOptions(); // Chromeoptions object
	
	options.addArguments("--remote-allow-origins=*");
	
	WebDriver driver = new ChromeDriver(options); // Webdriver object for chrome
	
	/// launch url for dropdown
	driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");

	/// find dropdown locator
	WebElement dropdownLocator = driver.findElement(By.xpath("(//select)[1]"));

	/// click dropdown using the object value
	dropdownLocator.click();
	
	Thread.sleep(2000);

	/// Create object for Select class and call the dropdown object into that
	Select dropdown = new Select(dropdownLocator);

	/// it selects third value Albania inside dropdown
	dropdown.selectByIndex(2);

	///// verify and validate
   String selectedValue = dropdown.getFirstSelectedOption().getText();

	if(selectedValue.equals("Albania"))
	
	{
		System.out.println("Test case is passed");
	
	} else {
		
		System.out.println("Test case is failed");
	}

}

}
