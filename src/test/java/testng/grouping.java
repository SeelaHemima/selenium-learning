package testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class grouping {
	 WebDriver driver;
	 
	 
  @Test
  public void login() {
	  WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.close();
  }
 @Test
 public void dropdown() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		
		WebElement countryse = driver.findElement(By.xpath("//select[@name='country']"));
		Select country = new Select(countryse);
		country.selectByValue("INDIA");
		 
}
 @Test
 public void calender() throws InterruptedException {
	 driver.get("https://demos.telerik.com/kendo-ui/datetimepicker/index");
		driver.manage().window().maximize();
		//scrolldown
		JavascriptExecutor js= (JavascriptExecutor)driver;
		WebElement scroll = driver.findElement(By.xpath("//h1[@class='kd-title']"));
		js.executeScript("arguments[0].scrollIntoView();",scroll);
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//button[@unselectable='on'])[2]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//table//tbody/tr[5]/td[4]/a")).click();
		
		
} 
}
