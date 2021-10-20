package courseAssignments;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Basic {

	@Test
	public void chromeTesting()
	{
		assertEquals(AllBrowserTesting.FacebookTitleTestingUsingChrome(),"Facebook – log in or sign up");
	}
	

	  @Test public void internetExploTesting() {
	  assertEquals(AllBrowserTesting.FacebookTitleTestingUsingInterNetExporer()
	  ,"Facebook – log in or sign up"); }
	  
	  @Test public void fireFoxTesting() {
	  assertEquals(AllBrowserTesting.FacebookTitleTestingUsingFirefox()
	  ,"Facebook – log in or sign up"); }
	 
}
