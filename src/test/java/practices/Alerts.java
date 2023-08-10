package practices;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		  driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver"); 
		  driver.manage().window().maximize();
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//input[@name='alert']")).click();
		  Thread.sleep(3000);
          Alert object = driver.switchTo().alert();
          object.accept();
          driver.findElement(By.xpath("//input[@name='confirmation']")).click();
          Thread.sleep(3000);
          object.dismiss();
          driver.findElement(By.xpath("//input[@name='prompt']")).click();
          Thread.sleep(3000);
          object.sendKeys("Thank you Ragul");
          Thread.sleep(3000);
          object.accept();


	}

}
