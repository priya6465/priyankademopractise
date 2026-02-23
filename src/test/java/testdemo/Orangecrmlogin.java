package testdemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Orangecrmlogin {
	public WebDriver driver;
	@Test
	public void loginTest() {
	// WebDriver driver=WebDriverManager.chromedriver().create();
	// WebDriver driver=WebDriverManager.firefoxdriver().create();
		//WebDriver driver=new FirefoxDriver();
		WebDriver driver=new ChromeDriver();
	 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(10));

	 driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
	 driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	String text=driver.findElement(By.xpath("//h6[text()='Dashboard']")).getText();
	if(text.equalsIgnoreCase("Dashboard")) {
		System.out.println("Text is correct");
	}
	else {

		System.out.println("text is not correct");
	}

	
	driver.findElement(By.xpath("//span[text()='Admin']")).click();
		
driver.quit();
		
	}

}