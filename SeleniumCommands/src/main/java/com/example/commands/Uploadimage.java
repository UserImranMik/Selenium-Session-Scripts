package com.example.imageupload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Uploadimage {

	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions(); // Chromeoptions object
		
		options.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(options); // Webdriver object for chrome
		
		/// launch url
		driver.get("https://demoqa.com/upload-download");
               
		/// find choose file
		WebElement chooseFile = driver.findElement(By.xpath("//input[@id = 'uploadFile']"));	
                
		/// image path in my local
		String imagePath = "C:\\Users\\DELL\\Downloads\\Capture.PNG";
		
		/// uploading image
		chooseFile.sendKeys(imagePath);
	
		/// verifying whether image is uploaded or not	       
	    if(driver.findElement(By.xpath("//p[@id='uploadedFilePath']")) != null) {
		
	    	System.out.println("Image is uploaded");
	   
	    } else {
		   
	    	System.out.println("Failed to upload");
	   }


	}

}
