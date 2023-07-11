package com.example.alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Alerthandles {

	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions(); // Chromeoptions object
		
		options.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(options); // Webdriver object for chrome
		
		/// launch url
		driver.get("https://demoqa.com/alerts");
		
		/// find first click me locator		
		WebElement clickMeFirstBtn = driver.findElement(By.id("alertButton"));		
		
		/// then clicking first click me btn		
		clickMeFirstBtn.click();	
		
          /// Alert appears, so I am getting into that		  
		  Alert alert = driver.switchTo().alert();		  
		  
		  /// Getting Alert message using getText(); method		  
		  String alertMessage = alert.getText();		  
		  
		  /// verifying the message appeared is equal to this "You clicked a button" or not		  
		  if(alertMessage.equals("You clicked a button")) {		  
			
			  /// click Ok btn when alert appeared			  
			  alert.accept();			  
			  
			  System.out.println("Test case is passed");	  
		  
		  } else {			  
			
			  System.out.println("Test case is failed");
		  }

		
	}

}
