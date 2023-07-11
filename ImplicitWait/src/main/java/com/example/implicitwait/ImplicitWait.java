package com.example.implicitwait;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ImplicitWait {

	public static void main(String[] args) {
		
        ChromeOptions options = new ChromeOptions(); // Chromeoptions object
 
        options.addArguments("--remote-allow-origins=*");

        WebDriver driver = new ChromeDriver(options); // Webdriver object for chrome

        String url = "https://demoqa.com/droppable";
        
        driver.get(url);
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
       
        System.out.println("Success");
	
		
	}

}
