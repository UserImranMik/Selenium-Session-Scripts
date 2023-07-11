package com.example.commands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserCommands {

	public static void main(String[] args) {
		
		 ChromeOptions options = new ChromeOptions(); // Chromeoptions object			
			
		 options.addArguments("--remote-allow-origins=*");		
			
			// Create Webdriver object to launch chrome		
			WebDriver driver = new ChromeDriver(options); 
			
			//get() command can load a new page
			driver.get("https://www.toolsqa.com/");
			
			// getTitle() command fetches the title of the current page window
			String title = driver.getTitle();
			
			// print the title
			System.out.println("Title of the page is : " + title);
			
			// getCurrentUrl() will fetches the url of the current page window
			String currentUrl = driver.getCurrentUrl();
			
			// print the current url
			System.out.println("The Current Url is " + currentUrl);
			
			// If the current window is the only window operating by WebDriver, 
			// it terminates the browser as well
			driver.close();
			
			// It terminates all tabs as well as the browser itself
			driver.quit();
			
			
			
			
			

	}

}
