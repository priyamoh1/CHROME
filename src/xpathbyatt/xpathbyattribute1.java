package xpathbyatt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathbyattribute1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com");
		driver.findElement(By.xpath("//input[@placeholder='Email address or phone number']")).sendKeys("priyaranjan");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("mohanty");
		Thread.sleep(1000);
		driver.get("https://demo.actitime.com");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("priyaranjan");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("mohanty");
		driver.get("https://opensource-demo.orangehrmlive.com");
		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("priyaranjan");
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("mohanty");
		Thread.sleep(1000);


	}

}
