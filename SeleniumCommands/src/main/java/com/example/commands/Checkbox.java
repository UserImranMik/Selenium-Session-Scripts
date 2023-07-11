package com.example.checkbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Checkbox {
	
  public static void main (String [] mik) {
	  
	  ChromeOptions options = new ChromeOptions(); // Chromeoptions object
		
	  options.addArguments("--remote-allow-origins=*");
		
	  WebDriver driver = new ChromeDriver(options); // Webdriver object for chrome
		
        /// launch url
	   driver.get("https://demoqa.com/checkbox");		
		
        /// maximize the browser
      driver.manage().window().maximize();
		
      /// find checkbox 
     WebElement checkboxLocator = driver.findElement(By.xpath("(//span[@class='rct-title'])[1]"));
	  
     /// verifying whether checkox is displayed or not
	  if(checkboxLocator.isDisplayed() == true) {
		  
		  /// verifying whether it is not selected		  
		  if(checkboxLocator.isSelected() == false) {
			  
           /// then I am selecting the checkbox as checked			  
			  checkboxLocator.click();
		
			  System.out.println("Test case is passed");		  
		 
		  } else {			  
			 
			  System.out.println("Test case is failed");
		  }
	  }

      }
	
   }
