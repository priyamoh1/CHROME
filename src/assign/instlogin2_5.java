package assign;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class instlogin2_5 {

	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//WebDriver driver=new FirefoxDriver();
		driver.get("https://instagram.com/");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[name='username']")).sendKeys("priyaranjan");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("mohanty");
		Thread.sleep(1000);
		
	}

}
