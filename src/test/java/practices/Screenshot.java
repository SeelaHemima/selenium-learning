package practices;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshot {
	public static void main(String[] args) throws InterruptedException, IOException{
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		 
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		driver.findElement(By.xpath("//span[text()='Admin']")).click();
		Thread.sleep(5000); 
		driver.findElement(By.xpath("(//div[text()='-- Select --'])[1]")).click();
		//driver.findElement(By.xpath("//div[text()='ESS']")).click();
		//WebElement User = driver.findElement(By.xpath("(//div[text()='-- Select --'])[1]"));
		//Select dropdown = new Select(User);
		//dropdown.selectByVisibleText("ESS");
		TakesScreenshot obj =(TakesScreenshot) driver;
		File source = obj. getScreenshotAs (OutputType.FILE);
		File target = new File("src/test/resources/Screenshots/loginorg.png");
		FileUtils.copyFile(source, target);
	}

}
