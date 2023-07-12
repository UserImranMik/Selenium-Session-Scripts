package com.example.commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PopupHandling {

	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions(); // Chromeoptions object
	
		options.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(options); // Webdriver object for chrome
	
		/// launch url
		driver.get("https://demoqa.com/modal-dialogs");		
	
		/// find small modal btn		
       WebElement smallModalPopup = driver.findElement(By.id("showSmallModal"));
	
	/// clicking small modal btn
	smallModalPopup.click();
	
	/// Reading message by using getText(); method	
	String popupMsg = driver.findElement(By.xpath("//div[text() = 'This is a small modal. It has very less content']")).getText();
	
	  /// Verifying popupMsg
	  if(popupMsg.equals("This is a small modal. It has very less content")) {  
                 
		  /// clicking Close btn in popup		  
          driver.findElement(By.id("closeSmallModal")).click();  
		  
          System.out.println("Test case is passed");		  
	  
	  } else {		  
		
		  System.out.println("Test case is failed");
	  }

		
	}

}
