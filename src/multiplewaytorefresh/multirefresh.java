package multiplewaytorefresh;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class multirefresh {

	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new  ChromeDriver();
		//driver.get("https://www.myntra.com/");
		//driver.navigate().refresh();
		//driver.get(driver.getCurrentUrl());
		driver.get("https://www.google.com/");
		WebElement ref=driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
		ref.sendKeys("search");
		driver.get("https://www.youtube.com/");
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_F5);
		r.keyRelease(KeyEvent.VK_F5);
	}
}