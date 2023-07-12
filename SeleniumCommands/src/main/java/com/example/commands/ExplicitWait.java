package com.example.commands;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions(); // Chromeoptions object
        
		options.addArguments("--remote-allow-origins=*");
        
		WebDriver driver = new ChromeDriver(options); // Webdriver object for chrome
        
		/// launch url
        driver.get("https://www.facebook.com/");    
        
        /// maximize window
        driver.manage().window().maximize();
        
        /// implicit wait to load url completely
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));     
        
        /// Create WebDriverWait object    
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2000));
        
        /// Username or Email locator        
        WebElement userName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));      
       
        /// enter username or email using sendKeys(); method in userName object      
        userName.sendKeys("Enter your existing facebook username or email here");
        
        /// password locator        
        WebElement passKey = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("pass")));        
        
        /// enter password using sendKeys(); method in passKey object        
        passKey.sendKeys("Enter your existing facebook password here");
        
        /// login btn / button locator       
        WebElement submitBtn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@name = 'login']")));        
        
        /// it clicks on login btn        
        submitBtn.click();
        
        /// Verifying whether it is logged in home page url or login page  url  
        if(driver.getCurrentUrl().equals("https://www.facebook.com/")) {       	
        
        	System.out.println("Test case is passed");       	
        
        } else {        	
        
        	System.out.println("Test case is failed");
        }

		
	}

}
