package com.example.screenshot;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.imageio.ImageIO;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

 public class Screenshots {

	public static void main(String[] args) throws IOException {
		
        ChromeOptions options = new ChromeOptions(); // Chromeoptions object
		
		options.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(options); // Webdriver object for chrome
		
		driver.get("https://demoqa.com/");
		
		driver.manage().window().maximize();

		try {
			
			 Date currentDate = new Date();
		 		
		   	  String screenshotWithDate = currentDate.toString().replace(":", "-");
		   	  
		   	  System.out.println(screenshotWithDate);
		   	  
		   	  String currentUrl = driver.getCurrentUrl();
		   	  
		   	  System.out.println(currentUrl);
//		   	  
//		   	  JavascriptExecutor js = (JavascriptExecutor) driver;
//		   	  
//		   	  js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		   	  
		   	  Screenshot screenshot = new AShot().takeScreenshot(driver);
		   	  
		   	boolean saveImage = ImageIO.write(screenshot.getImage(), "PNG", new File("D:\\Session Selenium Topics\\Screenshot\\src\\test\\java " +screenshotWithDate.trim()+".png"));
		    	 
		      System.out.println("Successful : "+saveImage);
			
			
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
		}

   }
	
 }
