package com.example.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.example.utility.Utility;

public class Loginlocators {
	
	WebDriver driver;

	By email = By.id("email"); // POM (Page Object Model)
	
	By password = By.id("pass"); // POM (Page Object Model)
	
	@FindBy(xpath = "//button[@name = 'login']") // Page Factory @FindBy annotation
	WebElement submitBtn; // Page Factory
	
	//// For validation	
	By home = By.xpath("//span[text() = 'Home']"); // POM (Page Object Model)
	
	
     public Loginlocators(WebDriver driver) {
		
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}

	public void loginAction(String emailId, String passKey) {
		
	   Utility utility = new Utility(driver);
	   
	   utility.sendKeysWithExplicitWait(driver, email, emailId, 10);
	   
	   utility.sendKeysWithExplicitWait(driver, password, passKey, 10);
	 
	}
	
	public void submitLogin() {
		
		Utility utility = new Utility(driver);
		
		utility.clickVisibilityOfElementLocated(driver, submitBtn, 10);
	}
	
	public void homeValidation() {
		
		boolean isLoggedIn = driver.findElements(home).size() > 0;
		
		if(isLoggedIn) {
			
			System.out.println("User is logged in.");
			
		} else {
			
			System.out.println("User is not logged in");
		}
		
		if(isLoggedIn) {
			
			WebElement homePage = driver.findElement(By.xpath("//span[text() = 'Home']"));
			
			 System.out.println("User is on the profile page.");
			
		} else {
			
			WebElement loginPage = driver.findElement(By.id("email"));
			
			 System.out.println("User is on the login page.");
		}
		
	}
	
	

   }
