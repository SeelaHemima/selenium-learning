package testng;


import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class orangehrmlogin {
	
		
	WebDriver driver;
	@BeforeMethod
public void launchapp(){
	WebDriverManager.chromedriver().setup();
	 driver= new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
}
	@Test
	public void login() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.name("username")).sendKeys("Admin");
		Thread.sleep(3000);
		driver.findElement(By.name("password")).sendKeys("admin123");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	
	
	
	@AfterMethod
	public void orange() throws IOException, InterruptedException {
		Thread.sleep(3000);
		TakesScreenshot obj=(TakesScreenshot)driver;
		File source = obj.getScreenshotAs(OutputType.FILE);
		File target= new File("src/test/resources/Screenshots/loginorange.png");
		FileUtils.copyFile(source, target);
		driver.close();
	}
}
