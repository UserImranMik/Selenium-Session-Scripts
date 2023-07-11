package com.example.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG {

	WebDriver driver;

	@BeforeTest
	public void driverInitialization() {
		ChromeOptions options = new ChromeOptions(); // Chromeoptions object
                   options.addArguments("--remote-allow-origins=*");
                  driver = new ChromeDriver(options); // Webdriver object for chrome
	}
	
	@Test(priority = 1)
	public void launchGoogle() {		
                  driver.get("https://www.google.com/"); 
                 driver.manage().window().maximize();
	}	
	@Test(priority = 2)
	public void launchFacebook() {		
              driver.get("https://www.facebook.com/");        
             driver.manage().window().maximize();	
	}	
	@AfterTest
	public void successMsg() {		
	    System.out.println("TestNG Executed Successfully");
             System.out.println();
	}  
	
}

	
	
	

