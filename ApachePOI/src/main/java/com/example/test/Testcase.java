package com.example.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.example.locators.Loginlocators;

public class Testcase {
	
  WebDriver driver;
	
	@Test(priority = 1)
	public void launchFbUsingExcel() throws IOException {
		
		ChromeOptions options = new ChromeOptions(); // Chromeoptions object
		
		options.addArguments("--remote-allow-origins=*");
		
		/// opening my chrome browser in incognito
		options.addArguments("--incognito");
		
		WebDriver driver = new ChromeDriver(options); // Webdriver object for chrome
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
	        if(driver.getCurrentUrl().equals("https://www.facebook.com/")) {
	        	
	        	/// Create instance of Loginlocators
	        	Loginlocators login = new Loginlocators(driver);
	        	
	        	/// Here I mentioned my local xlsx path in FileInputStream class to read path
	        	FileInputStream inputStream = new FileInputStream(
						"C:\\Users\\DELL\\Downloads\\For Session Apcahe POI Login.xlsx");

	        	/// Passing inputStream object into Workbook class
				Workbook workbook = new XSSFWorkbook(inputStream);

				/// Sheet is present under workbook in excel
				Sheet sheet = workbook.getSheet("Sheet1");
				
				/// iterating into last row of excel datas
				for(int i=1; i<sheet.getLastRowNum(); i++) {
					
					/// getting values in 0th cell for email / username
					String email = sheet.getRow(i).getCell(0).toString();
					
					System.out.println("Email id : " + email);
					
					/// getting values in 1st cell for password
					String password = sheet.getRow(i).getCell(1).toString();
					
					System.out.println("Password is : " + password);
					
					// it perform email and password inputs
					login.loginAction(email, password);
					
					// it perform submit action
					login.submitLogin();
					
					// it perform validation
					login.homeValidation();
					
				}			
				
	        }
	}

  }
