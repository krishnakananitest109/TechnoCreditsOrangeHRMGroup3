package com.technocredits.orangeHRM.Base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PredefinedMethods {
	WebDriver driver;
	
	public void initialization(){
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\maulik.kanani\\Downloads\\3rd_Party_Jars\\geckodriver.exe");
		//System.setProperty("webdriver.chrome.driver", "D:\\Technocredits\\Oct18_Framework\\orangehrmautomation\\src\\test\\resources\\chromedriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
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
