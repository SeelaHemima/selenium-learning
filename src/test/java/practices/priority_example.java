package practices;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class priority_example {
	
	
	@Test(priority=1)
	public void flipkartapp() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
	}
	
	
	/*
	 * @Test() public void flipkart_app() { WebDriverManager.edgedriver().setup();
	 * WebDriver driver=new EdgeDriver();
	 * 
	 * driver.get("https://www.flipkart.com/");
	 * 
	 * }
	 */

}
