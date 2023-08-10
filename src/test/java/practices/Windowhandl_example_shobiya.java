package practices;

import java.util.List;
import java.util.Set;

import org.apache.poi.ddf.EscherColorRef.SysIndexSource;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Windowhandl_example_shobiya {
	
	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
		WebElement search=driver.findElement(By.name("q"));
		search.sendKeys("Mobile");
		search.sendKeys(Keys.ENTER);
		
		
		
		List<WebElement>details=driver.findElements(By.xpath("//a[@target='_blank']/../../../.."));
		for(WebElement seela:details)
		{
			
		String alldata=seela.getText();
		System.out.println(alldata);
		}
		
		driver.findElement(By.xpath("//div[text()='POCO C50 (Royal Blue, 32 GB)']/..")).click();
		
		String parentwindow=driver.getWindowHandle();
		Set<String>allwindow=driver.getWindowHandles();
System.out.println(allwindow.size());		
		
	}
	

}
