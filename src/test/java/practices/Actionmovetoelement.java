package practices;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Actionmovetoelement {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		// C2ta site
		driver.get("https://c2ta.co.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		WebElement services =driver.findElement(By.xpath("(//span[text()='Services'])[1]"));
		WebElement Jobsupport =driver.findElement(By.xpath("(//span[text()='Job Support'])[1]"));
		Actions actions =new Actions(driver);		
		Thread.sleep(3000);
		actions.moveToElement(services).build().perform();
		
		actions.moveToElement(Jobsupport).click().build().perform();
		
		//Flipkart 
		
		
		
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//span[text()='Electronics']"))).build().perform();
		
		
	}

}
