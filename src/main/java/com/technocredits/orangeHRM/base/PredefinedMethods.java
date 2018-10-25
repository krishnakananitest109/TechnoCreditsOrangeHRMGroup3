package com.technocredits.orangeHRM.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class PredefinedMethods {
	
	static WebDriver driver;
	
	public void initialization(){
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		//driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);	
	}
	
   public void SetText(String locator,String value) {
	 /*  System.out.println( "Locator -- " + locator + " -- "
   + "value -- " + value + " -- " );
	   // driver.findElement(By.xpath(locator))
	 //  System.out.println( By.xpath(locator).toString() );
*/	   driver.findElement(By.xpath(locator)).sendKeys(value);
	   
	}
	
   public void Click(String locator){
	   driver.findElement(By.xpath(locator)).click();
   }
   public String getURL(){
	   return driver.getCurrentUrl();
	   
   }
   
   public WebElement getElement(String locator){
	   return driver.findElement(By.xpath(locator));
   }
   
   public void expandMenu(String locator){
	   Actions action =new Actions(driver);
	    WebElement element= getElement(locator);
	    action.moveToElement(element).build().perform();
   }

}
