package practices;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Actionsdrag {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		  driver.get("https://jquery.com/"); driver.manage().window().maximize();
		  JavascriptExecutor js = (JavascriptExecutor)driver; WebElement
		  scroll=driver.findElement(By.xpath("//h2[text()='Other Related Projects']"));
		  js.executeScript("arguments[0].scrollIntoView();",scroll);
		  Thread.sleep(5000);
		  driver.findElement(By.xpath("//div[@class='jqueryui small logo']")).click();
		  driver.findElement(By.xpath("//a[text()='Draggable']")).click();
		  
		  
		  WebElement frame=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		  driver.switchTo().frame(frame); WebElement
		  drag=driver.findElement(By.id("draggable")); Actions act=new Actions(driver);
		  act.dragAndDropBy(drag, 100, 200).build().perform();
		  driver.switchTo().defaultContent();
		  
		 
		 

		
	
		
		
		
		
		
		
	}

}
