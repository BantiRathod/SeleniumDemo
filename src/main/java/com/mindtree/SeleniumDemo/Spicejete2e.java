package com.mindtree.SeleniumDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Spicejete2e {
	public static void main(String[] args) throws InterruptedException {
		  
		  //SET PROPERTY FUCTION ACCEPTS TWO PARAMETER FIRST ONE IS KEY OR PROPERTY AND 2ND ONE IS VALUE OF KEY. THIIS WILL ALLOW SELENIUM TO ACCESS CHROME BROWSER.
		  System.setProperty("webdriver.chrome.driver", "G:\\MINDTREE\\SeleniumUnzipedFile\\chromedriver.exe");
		  
		  // CREATE CHROME DRIVER OBJECT.
		  WebDriver driver = new ChromeDriver();
		  
	      driver.get("https://beta.spicejet.com/");
	      
	      
}
}