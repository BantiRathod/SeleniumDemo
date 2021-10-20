package com.mindtree.SeleniumDemo;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MiniDriverExersice {

	 public static void main(String[] args) throws InterruptedException {
		  
		  //SET PROPERTY FUCTION ACCEPTS TWO PARAMETER FIRST ONE IS KEY OR PROPERTY AND 2ND ONE IS VALUE OF KEY. THIIS WILL ALLOW SELENIUM TO ACCESS CHROME BROWSER.
		  System.setProperty("webdriver.chrome.driver", "G:\\MINDTREE\\SeleniumUnzipedFile\\chromedriver.exe");
		  
		  // CREATE CHROME DRIVER OBJECT.
		  WebDriver driver = new ChromeDriver();
		
		  driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		  //CREATING FOOTERdRIVER WHICH CAN ONLY MANAGE FOOTER SECTION OF WEB PAGE.
		  WebElement footerDriver = driver.findElement(By.id("gf-BIG"));                     //LIMITING WEB DRIVER SCOPE 
		  
		  System.out.println(footerDriver.findElements(By.tagName("a")).size());
		  
		  //CREATING COLUMNdRIVER WHICH CAN ONLY MANAGE COLUMN SECTION OF FOOTER.
		  WebElement columnDriver = footerDriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		  
		  int links = columnDriver.findElements(By.tagName("a")).size();
		  
		  System.out.println(links);

			/*
			 * 1. we need to click on every link.
			 * 2. get the title of every link page. 
			 * 
			 * Answer: 
			 * ways 1(General way): using for loop we will click on link and after loading page we will have press left arrow open to come to the previous page then click 
			 *         on second link and so on..
			 *         
			 * ways 2(optimal way): open all links in separate tabs then using getWindowhandles method get all windows id and get title.
			 * */
		 for(int i=0; i<links; i++)
		 {
			 String clickOnLink = Keys.chord(Keys.CONTROL, Keys.ENTER);
			 columnDriver.findElements(By.tagName("a")).get(i).sendKeys(clickOnLink);
			// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			 
		 }
		  
		  //GET TITLE OF ALL LINK PAGE.
          Set<String> allWindowsId = driver.getWindowHandles();	
          Iterator<String> it = allWindowsId.iterator(); 
          
         while(it.hasNext())
         {
        	
        	 driver.switchTo().window(it.next());
        	 System.out.println(driver.getTitle());
         }
 		 
		  
	 }
}
