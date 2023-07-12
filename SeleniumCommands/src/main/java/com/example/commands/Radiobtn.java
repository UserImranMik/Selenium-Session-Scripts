package com.example.commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Radiobtn {
	
	public static void main(String [] args) {
		
        ChromeOptions options = new ChromeOptions(); // Chromeoptions object
		
		options.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(options); // Webdriver object for chrome
		
		driver.get("https://demoqa.com/radio-button");
		
		driver.manage().window().maximize();

		/// find radio button Yes
		WebElement radioBtnLocator = driver.findElement(By.xpath("//label[text() = 'Yes']"));

		/// Verifying above locator whether it is displayed in UI or not
		if (radioBtnLocator.isDisplayed() == true) {			

				/// then I am selecting radio button Yes
				radioBtnLocator.click();
				
				System.out.println("Test case is passed");						
			
		} else {
			
			System.out.println("Test case is failed");
		}
		
	 }

   }
