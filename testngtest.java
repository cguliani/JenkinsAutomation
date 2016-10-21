package newpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;


public class testngtest {
	
	public WebDriver driver;
	
	  @Test 
	  public void main() {
		
	  System.setProperty("webdriver.gecko.driver", "C:/geckodriver-v0.11.1-win64/geckodriver.exe");

	  driver = new FirefoxDriver();	  
	  
      driver.get("https://att.estoreqa01.inwk.com/login.form");
    
	  driver.findElement(By.xpath(".//*[@id='content']/form/table/tbody/tr[2]/td[2]/input[1]")).sendKeys("admin");
     
	  driver.findElement(By.xpath(".//*[@id='content']/form/table/tbody/tr[3]/td[2]/input")).sendKeys("Password1");

      //Click login
      driver.findElement(By.xpath(".//*[@id='content']/form/table/tbody/tr[4]/td/div/button")).click();

      System.out.println(" Login Successfully, now it is time to Log Off.");

    //  driver.findElement(By.xpath(".//*[@id='auth']/a"));
 
	  }
 
	
 /*
	  @BeforeMethod
  public void beforeMethod() {
	  
	  System.setProperty("webdriver.gecko.driver", "C:/geckodriver-v0.11.1-win64/geckodriver.exe");
      driver = new FirefoxDriver();
	 
      //Put a Implicit wait, this means that any search for elements on the page could take the time the implicit wait is set for before throwing exception

    //  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

      driver.get("https://att.estoreqa01.inwk.com/login.form");
      
      System.out.println("Bring page up");
  }
  
  

  @AfterMethod
  public void afterMethod() {

   driver.quit();
	  
  }
*/

 
}
