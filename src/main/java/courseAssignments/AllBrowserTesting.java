package courseAssignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;

public class AllBrowserTesting {

	 public static String FacebookTitleTestingUsingChrome()
	 {
		  
		  //SET PROPERTY FUCTION ACCEPTS TWO PARAMETER FIRST ONE IS KEY OR PROPERTY AND 2ND ONE IS VALUE OF KEY. THIIS WILL ALLOW SELENIUM TO ACCESS CHROME BROWSER.
		  System.setProperty("webdriver.chrome.driver", "G:\\MINDTREE\\SeleniumUnzipedFile\\chromedriver.exe");
		 
		  // CREATE CHROME DRIVER OBJECT.
		  WebDriver chromeDriver = new ChromeDriver();
		
		  chromeDriver.get("https://www.facebook.com/");
		 
		  return chromeDriver.getTitle();
	 }
	 
	 public static String FacebookTitleTestingUsingFirefox()
	 {
		  
		  //SET PROPERTY FUCTION ACCEPTS TWO PARAMETER FIRST ONE IS KEY OR PROPERTY AND 2ND ONE IS VALUE OF KEY. THIIS WILL ALLOW SELENIUM TO ACCESS CHROME BROWSER.
		 System.setProperty("webdriver.gecko.driver", "G:\\MINDTREE\\SeleniumUnzipedFile\\firefoxdriver.exe");

		 
		  // CREATE CHROME DRIVER OBJECT.
		 WebDriver  fireFoxDriver = new FirefoxDriver();
		
		 fireFoxDriver.get("https://www.facebook.com/");
		 
		  return fireFoxDriver.getTitle();
	 }
	 
	 public static String FacebookTitleTestingUsingInterNetExporer()
	 {
		  
		  //SET PROPERTY FUCTION ACCEPTS TWO PARAMETER FIRST ONE IS KEY OR PROPERTY AND 2ND ONE IS VALUE OF KEY. THIIS WILL ALLOW SELENIUM TO ACCESS CHROME BROWSER.
		 System.setProperty("webdriver.ie.driver", "G:\\MINDTREE\\SeleniumUnzipedFile\\IEdriverServer.exe");
		 
		  // CREATE CHROME DRIVER OBJECT.
		  WebDriver inernetExplorerFoxdriver = new InternetExplorerDriver();
		
		  inernetExplorerFoxdriver.get("https://www.facebook.com/");
		 
		  return  inernetExplorerFoxdriver.getTitle();
	 }
}
