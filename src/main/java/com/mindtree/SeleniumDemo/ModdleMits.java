package com.mindtree.SeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ModdleMits {

	 public static void main(String[] args) throws InterruptedException {
		  
		  //SET PROPERTY FUCTION ACCEPTS TWO PARAMETER FIRST ONE IS KEY OR PROPERTY AND 2ND ONE IS VALUE OF KEY. THIIS WILL ALLOW SELENIUM TO ACCESS CHROME BROWSER.
		  System.setProperty("webdriver.chrome.driver", "G:\\MINDTREE\\SeleniumUnzipedFile\\chromedriver.exe");
		  
		  // CREATE CHROME DRIVER OBJECT.
		  WebDriver driver = new ChromeDriver();
		  
	      driver.get("http://moodle.mitsgwalior.in/");
	      
	      driver.findElement(By.cssSelector("a[href*='login']")).click();                              //css locator regular expression. 
	      driver.findElement(By.xpath("//input[contains(@id,'username')]")).sendKeys("username");      // xpath regular expression
	      driver.findElement(By.xpath("//input[@name='password']")).sendKeys("pass");                //  customized xpath
	      driver.findElement(By.cssSelector("button[type = 'submit']")).click();                     //  customized css 
	     System.out.println(driver.findElement(By.cssSelector("div[class *= 'alert']")).getText()); 
	      
	      Thread.sleep(40000);
	      
	      driver.close();
}
}
