package test;

import org.testng.annotations.Test;
import static org.testng.Assert.assertTrue;
import org.testng.Reporter;


public class BasicValidation extends BaseTest{

	
	@Test
	public void pageTitleValidation() {
		String expectedResult = "Facebook – log in or sign up-ramesh";
		String actualResult = driver.getTitle();
		
		Reporter.log("Expected Result = " + expectedResult);
		Reporter.log("Actual Result = " + actualResult);
		
		assertTrue(actualResult.equals(expectedResult), "Mismatch in the expected result,");
	}
	
	@Test
	public void urlValidation() {
		String expectedResult = "https://www.facebook.com/";
		String actualResult = driver.getCurrentUrl();
		
		Reporter.log("Expected Result = " + expectedResult);
		Reporter.log("Actual Result = " + actualResult);
		
		assertTrue(actualResult.equals(expectedResult), "Mismatch in the expected result,");
	}
}
