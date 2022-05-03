package chrome;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class forbackrefresh {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.get("https://www.flipkart.com");
		//driver.navigate().to("https://www.flipkart.com");//open chrome without using get() method
		//driver.navigate().to("https://www.myntra.com");
		  driver.navigate().back(); driver.navigate().forward();
		  driver.navigate().refresh();
		  driver.close();
		  //driver.quit();
		 
	}

}
class b
{
	
}