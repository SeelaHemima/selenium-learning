package practices;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsSelectable {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		  driver.get("https://jquery.com/"); driver.manage().window().maximize();
		  JavascriptExecutor js = (JavascriptExecutor)driver; WebElement
		  scroll=driver.findElement(By.xpath("//h2[text()='Other Related Projects']"));
		  js.executeScript("arguments[0].scrollIntoView();",scroll);
		  Thread.sleep(5000);
		  driver.findElement(By.xpath("//div[@class='jqueryui small logo']")).click();
		  driver.findElement(By.xpath("//a[text()='Selectable']")).click();

			  WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
			  driver.switchTo().frame(frame); 
			  Actions act = new Actions(driver);
			  WebElement item1=driver.findElement(By.xpath("//li[text()='Item 1']"));
			  WebElement item4=driver.findElement(By.xpath("//li[text()='Item 4']"));
			  act.dragAndDrop(item1,item4).build().perform();
			  
			  
			 

	}

}
