package practices;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Calender {
@Test
	public void calender_exe() throws InterruptedException {
		

	WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
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
