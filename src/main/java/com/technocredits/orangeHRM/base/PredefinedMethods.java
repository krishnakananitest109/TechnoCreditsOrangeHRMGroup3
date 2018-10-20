package com.technocredits.orangeHRM.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PredefinedMethods {
	
	WebDriver driver;
	
	public void initialization(){
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);	
	}
	
   public void SetText(String locator,String value) {
	   driver.findElement(By.xpath(locator)).sendKeys(value);
	   
	}
	
   public void Click(String locator){
	   driver.findElement(By.xpath(locator)).click();
   }

}
