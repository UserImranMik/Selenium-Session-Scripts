package com.example.utility;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utility {

private static WebDriver driver;
	
	private static final int TIMEOUT_SECONDS = 10;
	
	private static WebDriverWait wait;
	
   public Utility(WebDriver driver) {
		
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}
	
	
	public void sendKeysWithExplicitWait(WebDriver driver, By locator, String text, int timeoutInSeconds) {
	       
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutInSeconds));
	     
		 WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	     
		 element.sendKeys(text);
	    
	 }
	
   public void clickVisibilityOfElementLocated(WebDriver driver, WebElement submitBtn, int i) {
		
		WebDriverWait driverWait = new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT_SECONDS));
		
		WebElement element2 = driverWait.until(ExpectedConditions.visibilityOf(submitBtn));
		
		element2.click();
	}
	



  }
