package com.mindtree.SeleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PassangerNumberSelectionYatra {
	 public static void main(String[] args) throws InterruptedException {
		  
		  //SET PROPERTY FUCTION ACCEPTS TWO PARAMETER FIRST ONE IS KEY OR PROPERTY AND 2ND ONE IS VALUE OF KEY. THIIS WILL ALLOW SELENIUM TO ACCESS CHROME BROWSER.
		  System.setProperty("webdriver.chrome.driver", "G:\\MINDTREE\\SeleniumUnzipedFile\\chromedriver.exe");
		  
		  // CREATE CHROME DRIVER OBJECT.
		  WebDriver driver = new ChromeDriver();
		  driver.get("https://www.yatra.com/");
		 
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  
		  driver.findElement(By.cssSelector(".txt-ellipses.flight_passengerBox.travellerPaxBox")).click();
		  int i=0;
		  while(i++<2)
		  driver.findElement(By.cssSelector("div[data-flightagegroup='child'] .ddSpinnerPlus")).click();
	 }
	 
}
