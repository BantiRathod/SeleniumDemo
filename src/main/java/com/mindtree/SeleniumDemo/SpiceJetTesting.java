package com.mindtree.SeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SpiceJetTesting {

	 public static void main(String[] args) throws InterruptedException {
		  
		  //SET PROPERTY FUCTION ACCEPTS TWO PARAMETER FIRST ONE IS KEY OR PROPERTY AND 2ND ONE IS VALUE OF KEY. THIIS WILL ALLOW SELENIUM TO ACCESS CHROME BROWSER.
		  System.setProperty("webdriver.chrome.driver", "G:\\MINDTREE\\SeleniumUnzipedFile\\chromedriver.exe");
		  
		  // CREATE CHROME DRIVER OBJECT.
		  WebDriver driver = new ChromeDriver();
		  
	      driver.get("https://beta.spicejet.com/");
	      
			/*
			 * driver.findElement(By.
			 * xpath("//div[@data-testid='search-source-code'] //div[@data-testid='search-source-code']"
			 * )).click(); driver.findElement(By.
			 * xpath("//div[@data-testid='search-destination-btn'] //div[@data-testid='search-destination-code']"
			 * )).click();
			 */
	      
	     WebElement source =  driver.findElement(By.xpath("//div[@data-testid='search-source-code']"));
	     source.click();
	     driver.findElement(By.xpath("//div[@data-testid='auto-cmp-row-1']")).sendKeys(Keys.ENTER);
	 
	 }
}