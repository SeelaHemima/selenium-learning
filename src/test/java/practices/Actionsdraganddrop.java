package practices;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Actionsdraganddrop {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		  driver.get("https://jquery.com/"); driver.manage().window().maximize();
		  JavascriptExecutor js = (JavascriptExecutor)driver; WebElement
		  scroll=driver.findElement(By.xpath("//h2[text()='Other Related Projects']"));
		  js.executeScript("arguments[0].scrollIntoView();",scroll);
		  Thread.sleep(5000);
		  driver.findElement(By.xpath("//div[@class='jqueryui small logo']")).click();
		  driver.findElement(By.linkText("Droppable")).click();
		  Thread.sleep(5000);
		  WebElement frame=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		  driver.switchTo().frame(frame); 
		  Actions act=new Actions(driver);
		  WebElement drag= driver.findElement(By.xpath("//p[text()='Drag me to my target']"));
		  WebElement drop= driver.findElement(By.id("droppable"));
		  act.dragAndDrop(drag, drop).build().perform();
		  driver.switchTo().defaultContent();
		

	}

}
