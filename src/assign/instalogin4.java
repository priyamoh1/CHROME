package assign;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class instalogin4 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://instagram.com");
		driver.findElement(By.cssSelector("input[type=\"text\"]")).sendKeys("priyaranjan");
		driver.findElement(By.cssSelector("input[aria-label=\"Password\"]")).sendKeys("Killbill@1");
	}

}
