package test;

import org.testng.annotations.Test;
import org.openqa.selenium.By;


public class Login extends BaseTest{

	
	@Test
	public void validUsernameValidPasswordTest() {
		driver.findElement(By.id("email")).sendKeys("dan@gmail.com");
	}
}
