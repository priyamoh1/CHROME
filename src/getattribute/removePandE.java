package getattribute;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class removePandE {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com");
		WebElement username=driver.findElement(By.id("email"));
		//username.sendKeys("qspiders");
		/*
		 * username.sendKeys(Keys.ARROW_LEFT); username.sendKeys(Keys.ARROW_LEFT);
		 * username.sendKeys(Keys.ARROW_LEFT); username.sendKeys(Keys.ARROW_LEFT);
		 * username.sendKeys(Keys.ARROW_LEFT); username.sendKeys(Keys.BACK_SPACE);//    assignment 1
		 * username.sendKeys(Keys.ARROW_RIGHT); username.sendKeys(Keys.ARROW_RIGHT);
		 * username.sendKeys(Keys.DELETE);
	 */
	
		/*
		 * username.sendKeys(Keys.ARROW_LEFT); username.sendKeys(Keys.ARROW_LEFT);
		 * username.sendKeys(Keys.ARROW_LEFT); username.sendKeys(Keys.ARROW_LEFT);// assignment 2
		 * username.sendKeys(Keys.ARROW_LEFT); username.sendKeys(Keys.ARROW_LEFT);
		 * username.sendKeys(Keys.ARROW_LEFT); username.sendKeys(Keys.ARROW_LEFT);
		 * username.sendKeys("jspiders");
		 */
	      
		/*
		 * username.sendKeys(Keys.SPACE); username.sendKeys("pyspiders");          // assignment 3
		 */
		
		//username.sendKeys(Keys.CONTROL,"A");
	    //Thread.sleep(1000);
		//or
		//username.sendKeys(Keys.SHIFT,"qspiders");assignment 4
		
		
		/*
		 * username.sendKeys("QSPIDERS"); username.sendKeys(Keys.CONTROL,"a");
		 * username.sendKeys("qspiders"); // assignment 5
		 */		 
		
		
		  username.sendKeys("qspiders"); 
		  username.sendKeys(Keys.TAB,"jspiders");
		  //driver.findElement(By.id("pass")).sendKeys("jspiders");
		 //assignment 6
		
		
		
		 
		
		
	}

}
