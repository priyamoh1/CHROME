package handlingmouseoperation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class clickandhold {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new  ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com");
		WebElement lclick=driver.findElement(By.xpath("//a[.='Forgotten password?']"));
		Actions act=new Actions(driver);
		act.clickAndHold(lclick).perform();
		Thread.sleep(3500);
		act.release(lclick).perform();
		
	}

}
