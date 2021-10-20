package com.mindtree.SeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouceInteractionWithActionClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 System.setProperty("webdriver.chrome.driver", "G:\\MINDTREE\\SeleniumUnzipedFile\\chromedriver.exe");
		  
		  // CREATE CHROME DRIVER OBJECT.
		  WebDriver driver = new ChromeDriver();
		  
	      driver.get("http://amazon.in/");
	      
	      // TO MAXIMIZE WINDOW
	      driver.manage().window().maximize();          
	      Actions a = new Actions(driver);                //NEED TO PASS DRIVER SO THAT ACTION OBJECT COULD TAKE ALL PROPERTIES OF DRIVER.
	      
	      
	      
	      
	      //MOVE MOUSE TO SPECIFIC ELEMENT 
	      a.moveToElement(driver.findElement(By.id("nav-link-accountList-nav-line-1"))).build().perform();    //MOUCE MOMENT ACTIONS
	      
	      a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("mobile").sendKeys(Keys.ENTER).build().perform();
	}

}
