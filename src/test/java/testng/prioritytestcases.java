package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class prioritytestcases {
  @Test(priority=6)
  public void testcase1() {
	  System.out.println("testcase1");
  }
  
  @Test(priority=4)
  public void testcase2() {
	  System.out.println("testcase2");
  }
  @Test(priority=5)
  public void testcase3() {
	  System.out.println("testcase3");
  }

{
}

	  @Test(priority=3)
	  public void testcase4() {
		  System.out.println("testcase4");
	  }
	  
	  @Test(priority=2)
	  public void testcase5() {
		  System.out.println("testcase5");
	  }
	  @Test(priority=1)
	  public void testcase6() {
		  System.out.println("testcase6");
	  }
	}
	  