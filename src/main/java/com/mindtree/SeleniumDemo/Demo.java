package com.mindtree.SeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	
  public static void main(String[] args) throws InterruptedException {
	 
		/* STEPS:-
		 * we have to download crome driver zip file and extract it, this file used to allow selenium to access chrome browser.(line no. 14).
		 * after that has to create chrome driver object using it we will handle entire web application.
		 * */
	  
	  //SET PROPERTY FUCTION ACCEPTS TWO PARAMETER FIRST ONE IS KEY OR PROPERTY AND 2ND ONE IS VALUE OF KEY. THIIS WILL ALLOW SELENIUM TO ACCESS CHROME BROWSER.
	  System.setProperty("webdriver.chrome.driver", "G:\\MINDTREE\\SeleniumUnzipedFile\\chromedriver.exe");
	  
	  // CREATE CHROME DRIVER OBJECT.
	  WebDriver driver = new ChromeDriver();                                                   // TO CREATE CHROME WEB DRIVER OBJECT.
	  
	  driver.get("https://atlanticbooks.com/");                                                         // TO GET HIT URL ON WEB BROWSER.
	  
	  driver.findElement(By.xpath("//a[text() = 'Sign In']")).click();  
	  driver.findElement(By.id("email")).sendKeys("XYZ@gmail.com");                            // AFTER EMAIL INPUT FIELD PASTE THIS MESSAGE.
	  driver.findElement(By.id("pass")).sendKeys("XYZ@123");                           // AFTER PASS INPUT FIELD PASTE THIS MESSAGE.
	  driver.findElement(By.name("send")).click();
	  Thread.sleep(4000);   
	  //driver.findElement(By.linkText("Forgotten password?")).click();                                                      //STOP CURRENT THREAD FOR 4 SEC.
	
	 // System.out.println(driver.getTitle());
	  
	  driver.close();
	  
	  // By.className("inputtext _55r1 _6luy _9npi") :- error would be thrown because of compound class name(class name having spaces).
  }
}
