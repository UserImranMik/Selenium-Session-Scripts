package com.example.commands;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Getsize {

	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions(); // Chromeoptions object	
		
		options.addArguments("--remote-allow-origins=*");		
		
		WebDriver driver = new ChromeDriver(options); // Webdriver object for chrome		
		
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");		    
		
		driver.manage().window().maximize();		    
		
		WebElement element = driver.findElement(By.xpath("//div[@class='single_tab_div resp-tab-content resp-tab-content-active']//p//select"));		    
		
		element.click();	
	    
		Dimension dimension = element.getSize();    
	    
		System.out.println(dimension);     
	    
		System.out.println("Height : " + dimension.height +" "+ "Width : " + dimension.width);
		
	}

}
