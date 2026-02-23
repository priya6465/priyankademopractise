package testdemo;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testgoogletitle {
	public WebDriver driver;
	@Test
	public void googlettest() {
	 WebDriver driver=WebDriverManager.chromedriver().create();
		driver.get("https://www.google.com/");
		String Title=driver.getTitle();
		if(Title.equalsIgnoreCase("Google")) {
			System.out.println("Testcase marked as passed");
		}
		else {
			System.out.println("testcase marked as failedS");
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//driver.close();
		driver.quit();
		
	}
	
}
