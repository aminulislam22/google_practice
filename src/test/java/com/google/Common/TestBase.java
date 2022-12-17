package com.google.Common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	
	public  WebDriver driver;
	
    public void LaunchBrowser() {
    	
    	WebDriverManager.chromedriver().setup();
    	driver= new ChromeDriver();
    	driver.get("https://www.amazon.com/");
    	driver.manage().window().maximize();
    	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
    }
    
    
}
