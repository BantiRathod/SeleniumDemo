package com.mindtree.SeleniumDemo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AutoSuggetionDropdown {

	 public static void main(String[] args) throws InterruptedException {
		  
		  //SET PROPERTY FUCTION ACCEPTS TWO PARAMETER FIRST ONE IS KEY OR PROPERTY AND 2ND ONE IS VALUE OF KEY. THIIS WILL ALLOW SELENIUM TO ACCESS CHROME BROWSER.
		  System.setProperty("webdriver.chrome.driver", "G:\\MINDTREE\\SeleniumUnzipedFile\\chromedriver.exe");
		  
		    // CREATE CHROME DRIVER OBJECT.
		    WebDriver driver = new ChromeDriver();
		
		    driver.get("https://beta.spicejet.com/");
		  
		    driver.findElement(By.cssSelector("div[data-testid='round-trip-radio-button']")).click();
		      
		    driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		    
		    // USED PARENT CHILD RELATIONSHIP CONCEPT.
		    WebElement fromWebEle =  driver.findElement(By.cssSelector(" div[data-testid='to-testID-origin'] .css-1cwyjr8.r-homxoj.r-ubezar.r-10paoce.r-13qz1uu"));
		    fromWebEle.click();
		    fromWebEle.sendKeys("BOM");                      //IF WE PASS AIRPORT CODE THEN IT IS GOING TO SELECT IT DIRECTELY
		     
		    driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		    
		    WebElement destinationWebEle =  driver.findElement(By.cssSelector(" div[data-testid='to-testID-destination'] .css-1cwyjr8.r-homxoj.r-ubezar.r-10paoce.r-13qz1uu"));
			
		    destinationWebEle.click();
		    destinationWebEle.sendKeys("BLR");
			 
		    driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
			
		 
		    //TO SELECT DEPARTURE WEB ELEMENT 
		    WebElement dpartureMonthDriver = driver.findElement(By.cssSelector("div[data-testid='undefined-month-November-2021']"));
		    dpartureMonthDriver.findElement(By.cssSelector("div[data-testid='undefined-calendar-day-8']")).click();
		    
		    driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		    
		    //TO SELECT RETURN WEB ELEMENT
		    WebElement returnMonthDriver = driver.findElement(By.cssSelector("div[data-testid='undefined-month-November-2021']"));
		    returnMonthDriver.findElement(By.cssSelector("div[data-testid='undefined-calendar-day-9']")).click();
		    
		    driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		    
		    
			/*TO SELECT REDIO BUTTON OF PASANGER TYPE //IN A PERTICULAR GROUPH ALL THE
			 * 
			 * RADIO BUTTONS CONTAIN SAME PROPERTY SO FIRST OF ALL FIND ALL REDIO BUTTON
			 * ELEMENT.
			 */		  
		    List<WebElement> lists = driver.findElements(By.cssSelector(".css-76zvg2.r-cqee49.r-n6v787.r-1ozqkpa"));
		    
		    String pasanger = "Armed Forces";
		    
		    for(int i=0; i<lists.size(); i++)
		    {
		    	if(lists.get(i).getText().equals(pasanger))
		    	{
		    		lists.get(i).click();
		    		System.out.println(lists.get(i).getText());
		    		break;
		    	}
		    }
		    
		    driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		    
		   // driver.findElement(By.cssSelector(".css-1dbjc4n.r-1loqt21.r-1otgn73")).click();   
		    
			/*TO SELECT CURRANCY (STATIC DROPDOWN)
			 * css-76zvg2 css-bfa6kz r-homxoj r-ubezar
			 * FOR STATIC DROPDOWN WE WOULD LIKE TO USE SELECT CLASS WHICH CONTAINS A METHOD GETTEXT BY VALUE, VISIBLETEXT,INDEX. 
			 */
		    
		   WebElement curr = driver.findElement(By.cssSelector(".css-1dbjc4n.r-150rngu.r-eqz5dr.r-16y2uox.r-1wbh5a2.r-11yh6sk.r-1rnoaur.r-1sncvnh"));
		   List<WebElement> cuuList = curr.findElements(By.cssSelector(".css-76zvg2.r-homxoj.r-ubezar")); 
		   
		   for(int i=0; i<cuuList.size(); i++)
		   {
			   if(cuuList.get(i).getText().equals("EUR"))
			   {
				   cuuList.get(i).click();
				   break;
			   }
		   }
		   
		   System.out.println(cuuList.size());
		   
		   //driver.findElement(By.cssSelector("div[data-testid='Adult-testID-plus-one-cta']")).click();
		   
		    
		    //sssSelect s = new Select(driver.findElement(By.cssSelector(".css-76zvg2.css-bfa6kz.r-1862ga2.r-1gkfh8e")));
		    
		    
		    
		    
		    /*
			 * THIS IS CONCEPT OF PRESSING EXT AND PREVIOUS BUTTON
			 * 
			 * if(driver.findElement(By.cssSelector(
			 * ".css-1dbjc4n.r-1loqt21.r-u8s1d.r-11xbo3g.r-1v2oles.r-1otgn73.r-16zfatd.r-eafdt9.r-1i6wzkk.r-lrvibr.r-184en5c"
			 * ))!=null) { System.out.println("got it"); driver.findElement(By.cssSelector(
			 * ".css-1dbjc4n.r-1loqt21.r-u8s1d.r-11xbo3g.r-1v2oles.r-1otgn73.r-16zfatd.r-eafdt9.r-1i6wzkk.r-lrvibr.r-184en5c"
			 * )).click(); }
			 */
		    
		    
		    /*  FOR YATRA WABSITE. 
		     * 
		     * driver.get("https://www.yatra.com/");
			 * Thread.sleep(4000L); WebElement source =
			 * driver.findElement(By.id("BE_flight_origin_city")); //TO GET WEB
			 * OBJECT(ELEMENT) Thread.sleep(4000L); source.clear(); source.sendKeys("DEL");
			 * // WHEN WE SEND ANY KEYWORD FOR INPUT FIELD THEN AUTOMATIC SUGGETIONS WOULD
			 * COME. source.sendKeys(Keys.DOWN); //kEYS IS ENUM USIING IT WE CAN PRESS ANY
			 * KEY AUTOMATICALLY source.sendKeys(Keys.ENTER);
			 * 
			 * 
			 * WebElement destination = driver.findElement(By.id("BE_flight_arrival_city"));
			 * Thread.sleep(4000L); destination.clear();
			 * 
			 * destination.sendKeys("BOM"); Thread.sleep(7000L);
			 * destination.sendKeys(Keys.DOWN);
			 * 
			 * //INORDER TO GO DOWN MULTIPLE TIME USE LOOPS
			 * destination.sendKeys(Keys.ENTER); Thread.sleep(7000L);
			 */
	    
	   //driver.close();
	}

	

}
