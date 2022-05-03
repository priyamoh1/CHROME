package assign;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class one {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com");
		//WebElement username=driver.findElement(By.id("username"));
		//username.sendKeys("admin");
		//WebElement password=driver.findElement(By.name("pwd"));
		//password.sendKeys("manager");
		//WebElement keepmeloggedin=driver.findElement(By.id("keepLoggedInLabel"));
		//keepmeloggedin.click();
		//WebElement clickonlogin=driver.findElement(By.id("loginButton"));
		//clickonlogin.click();
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("keepLoggedInLabel")).click();
		driver.findElement(By.id("loginButton")).click();
		
		
		
	}

}
