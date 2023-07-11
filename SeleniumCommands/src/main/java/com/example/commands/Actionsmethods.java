package com.example.commands;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Actionsmethods {

	public static void main (String [] args) throws InterruptedException {
		
        ChromeOptions options = new ChromeOptions(); // Chromeoptions object
		
		options.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(options); // Webdriver object for chrome
		
		    driver.get("https://www.toolsqa.com/");
		    
		    driver.manage().window().maximize();
		
		    if(driver.getCurrentUrl().equals("https://www.toolsqa.com/")) {
		      	
		    	// create Actions class 
		    	Actions actions = new Actions(driver);
		    	
		    	WebElement demoSite = driver.findElement(By.xpath("(//a[text() = 'Demo Site'])[1]"));
		    	
		    	// moveToElement methods used by using actions object
		    	actions.moveToElement(demoSite).click().perform();
		    	
		    	Thread.sleep(3000);
		    	
		    	// iterating into child window
		    	String parentWindow = driver.getWindowHandle();  // current window ,return type String
		    	
		    	Set<String> windows = driver.getWindowHandles();  // Set = Collection of list
		    	
		    	for(String childWindow : windows) {     // for(return type userDefined : return object) {    }
		    	 	
		    		if(!parentWindow.equals(childWindow)) {
		    			
		    			driver.switchTo().window(childWindow);

		    			System.out.println("Test case is passed");
		    			
		    			break;
		   
		    		}
		    	}
		    	
		    }
		
		
		
		
		
	}
	
}
