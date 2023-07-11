package com.example.commands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NavigationCommands {

	public static void main(String[] args) {
		
        ChromeOptions options = new ChromeOptions(); // Chromeoptions object			
		
		options.addArguments("--remote-allow-origins=*");		
		
		// Create Webdriver object to launch chrome		
		WebDriver driver = new ChromeDriver(options); 
		
		driver.get("https://www.toolsqa.com/");
		
			// navigate.to will navigate you to the below url
			driver.navigate().to("https://www.facebook.com/");
			
			// back() command will navigate back from fb url
			driver.navigate().back();
			
			// forward() command will navigate to forward by one page from back
			driver.navigate().forward();
			
			// refresh() command refresh the current window
			driver.navigate().refresh();
			
			System.out.println("Test case passed");
			
		
		
		
		
		
		
		
		
		
		

	}

}
