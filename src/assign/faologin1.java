package assign;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class faologin1 
{

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.get("https://en-gb.facebook.com");
		//driver.findElement(By.cssSelector("input[data-testid=\"royal_email\"]")).sendKeys("priyaranjan");
		//driver.findElement(By.cssSelector("input[data-testid=\"royal_pass\"]")).sendKeys("mohanty");
		//driver.findElement(By.cssSelector("button[type=\"submit\"]")).click();
		//driver.get("https://demo.actitime.com");
		//driver.findElement(By.cssSelector("input[name=\"username\"]")).sendKeys("admin");
		//driver.findElement(By.cssSelector("input[name=\"pwd\"]")).sendKeys("manager");
		//driver.findElement(By.cssSelector("a[id=\"loginButton\"]")).click();
		driver.get("https://opensource-demo.orangehrmlive.com");
		driver.findElement(By.cssSelector("input[id=\"txtUsername\"]")).sendKeys("Admin");
		driver.findElement(By.cssSelector("input[id=\"txtPassword\"]")).sendKeys("admin123");
		driver.findElement(By.cssSelector("input[id=\"btnLogin\"]")).click();
	}

}
