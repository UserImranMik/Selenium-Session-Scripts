package com.example.dragdrop;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions(); // Chromeoptions object
		
		options.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(options); // Webdriver object for chrome
        
		/// launch url
		String url = "https://demoqa.com/droppable";
		   
		driver.get(url);
        
		/// maximize window
		driver.manage().window().maximize();
        
		   /// it clicks on prevent propogation btn
		   driver.findElement(By.id("droppableExample-tab-preventPropogation")).click();	
           
		   /// drag source locator
		   WebElement imageSource = driver.findElement(By.xpath("//div/div[@id = 'dragBox']"));	
           
		   /// drag destination locator
		   WebElement imageTarget = driver.findElement(By.xpath("//div[@id = 'greedyDropBoxInner']"));	
            
		   /// Verifying whether imageSource and imageTarget is present or not	   
		   if(imageSource.isDisplayed() && imageTarget.isEnabled()) {	
           
			   /// create Actions class object		   
			   Actions actions = new Actions(driver);		

			   /// implicit wait for 2 seconds	  
	           driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));		

	           /// using dragAndDrop method inside actions  object, I am drag and drop the two locators   
			 actions.dragAndDrop(imageSource, imageTarget).build().perform();       

			 // or else use this below commented code instead of above
	        //actions.clickAndHold(imageSource).moveToElement(imageTarget).release(imageTarget).build().perform();         
  		
			 System.out.println("Test case is passed");		   		   
		   
		   }  else {			   
			
			   System.out.println("Test case is failed");
		   }


	}

}
