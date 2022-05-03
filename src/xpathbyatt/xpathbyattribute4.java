package xpathbyatt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathbyattribute4 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://instagram.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@aria-label='Phone number, username, or email']")).sendKeys("priyaranjan");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@aria-label='Password']")).sendKeys("priyaranjan");
		Thread.sleep(1000);

	}

}
