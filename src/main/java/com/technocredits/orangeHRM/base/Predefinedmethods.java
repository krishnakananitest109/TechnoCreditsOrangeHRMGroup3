package com.technocredits.orangeHRM.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Predefinedmethods 
{
	WebDriver driver;
	
		public void initialization(){
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sakshi\\Desktop\\Orangegitproject\\TechnoCreditsOrangeHRMGroup3\\src\\test\\resources\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://opensource-demo.orangehrmlive.com/");
			driver.manage().window().maximize();
			//driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);		
		}
		
		public void setText(String locator, String value)
		{
			driver.findElement(By.xpath(locator)).sendKeys(value);
		}
		
		public void click(String locator)
		{
			driver.findElement(By.xpath(locator)).click();
		}
}
