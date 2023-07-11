package com.example.commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SeleniumCommands {

	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions(); // Chromeoptions object			
		
		options.addArguments("--remote-allow-origins=*");		
		
		// Create Webdriver object to launch chrome		
		WebDriver driver = new ChromeDriver(options); 			
		
		// driver.get() method launches the below provided url
		driver.get("https://www.toolsqa.com/"); 						
        
		// it maximize the current window
		driver.manage().window().maximize();				
	  
		// it gives input "Hi"
		driver.findElement(By.xpath("//input[@class='navbar__search--input']")).sendKeys("Hi");
		
		// it clears input "Hi"
		driver.findElement(By.xpath("//input[@class='navbar__search--input']")).clear();
	   
		// it performs click action
	    driver.findElement(By.xpath("//ul[@class='navbar__links d-none d-lg-flex']//a[normalize-space()='About']")).click();
	   
	   // getTitle() method returns the current window's title
	   String title = driver.getTitle();   
	  
	   // print the title value
	   System.out.println("Title of the page is : " + title); 
	  
       // getCurrentUrl() method returns the current windows's url
	   String url = driver.getCurrentUrl();	   
	  
	   // print the url value
	   System.out.println("Current url is : " + url);
	   
	   // getText() method retrieve the text, which is basically the innertext of a WebElement
	   String text = driver.findElement(By.xpath("//ul[@class='navbar__links d-none d-lg-flex']//a[normalize-space()='About']")).getText();	   
	   
	   // print the text value
	   System.out.println("The text is : " + text);
	   
	   // it returns page source 
	   String pageSource = driver.getPageSource();
	   
	   // print page source value
	   System.out.println("The page source is : " + pageSource);
	   
	   // close() method terminates the current window
	   driver.close();	   
	   
	   // quit() method terminated the all window
	   driver.quit();


	}

}
