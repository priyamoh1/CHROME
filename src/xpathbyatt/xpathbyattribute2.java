package xpathbyatt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathbyattribute2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com");
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@aria-label='First name']")).sendKeys("priyaranjan");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@aria-label='Surname']")).sendKeys("mohanty");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@aria-label='Mobile number or email address']")).sendKeys("9348420927");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@aria-label='New password']")).sendKeys("9348420927");
		Thread.sleep(1000);
		driver.get("https://login.yahoo.com");
		driver.findElement(By.xpath("//a[@id='createacc']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='usernamereg-firstName']")).sendKeys("priyaranjan");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='usernamereg-lastName']")).sendKeys("mohanty");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='usernamereg-yid']")).sendKeys("priyarocks");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='usernamereg-password']")).sendKeys("priyamohanty");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='usernamereg-phone']")).sendKeys("9348420927");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='usernamereg-freeformGender']")).sendKeys("male");

	}

}
