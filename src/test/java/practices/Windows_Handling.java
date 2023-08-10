package practices;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Windows_Handling {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("mobile");
		
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//div[@class='_2kHMtA'])[1]")).click();
		
		
		Set<String> id = driver.getWindowHandles();
		
		
		System.out.println(id);
		
		
		List<String> li= new ArrayList<String>();
		
		li.addAll(id);
		
		
		String id2 = li.get(1);
		
		driver.switchTo().window(id2);
		
		
		driver.findElement(By.xpath("//button[text()='Add to cart']")).click();
	}

}
