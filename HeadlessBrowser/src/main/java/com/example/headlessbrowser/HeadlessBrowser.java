package com.example.headlessbrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessBrowser {

	public static void main(String[] args) {

		ChromeOptions options = new ChromeOptions(); // Chromeoptions object
        
        options.addArguments("--remote-allow-origins=*");
        
        options.addArguments("--headless"); // Run in headless browser mode
        
       // options.addArguments("--disable-gpu"); // Disable the GPU acceleration
        
		WebDriver driver = new ChromeDriver(options); // Webdriver object for chrome
		
		driver.get("https://demoqa.com/");
		
		  if(driver.getCurrentUrl() != null) {
			  
			String title = driver.getTitle();
			
			if(title.equalsIgnoreCase("DEMOQA") == true) {
				
				System.out.println("Test case is success");
			
			} else {
				
				System.out.println("Test case is failed");
			}
			  
        
		  }

		
	}

}
