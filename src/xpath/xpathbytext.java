package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathbytext {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com");
		//driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
		driver.findElement(By.xpath("//a[.='Forgotten password?']")).click();

	}

}
