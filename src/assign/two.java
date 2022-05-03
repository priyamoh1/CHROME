package assign;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class two {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com");
		//driver.findElement(By.name("txtUsername")).clear();
		//WebElement username=driver.findElement(By.name("txtUsername"));
		//username.sendKeys("Admin");
		//driver.findElement(By.name("txtPassword")).clear();
		//WebElement password=driver.findElement(By.id("txtPassword"));
		//password.sendKeys("admin123");
		//WebElement clickonlogin=driver.findElement(By.id("btnLogin"));
		//clickonlogin.click();
		//driver.findElement(By.id("txtUsername")).clear();
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		//driver.findElement(By.name("txtPassword")).clear();
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		
		
	}

}
