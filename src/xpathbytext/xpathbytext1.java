package xpathbytext;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathbytext1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com");
		driver.findElement(By.xpath("//a[.='Forgot your password?']")).click();
		Thread.sleep(1000);
		driver.get("https://opensource-demo.orangehrmlive.com");
		driver.findElement(By.xpath("//a[.='Forgot your password?']")).click();
	}

}
