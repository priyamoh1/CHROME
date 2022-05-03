package filedownloadpopup;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class fdp {

	public static void main(String[] args) throws AWTException, InterruptedException
	{
		//FirefoxOptions options=new FirefoxOptions();
		//options.addPreference("browser.download.useDownloadDir", false);
		
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://selenium.dev/downloads/");
		driver.findElement(By.xpath("(//p[.='Java']/..//p/a)[1]")).click();
		
		/*
		 * Robot r=new Robot(); r.keyPress(KeyEvent.VK_TAB); Thread.sleep(2000);
		 * r.keyPress(KeyEvent.VK_TAB); Thread.sleep(2000);
		 * r.keyPress(KeyEvent.VK_ENTER); Thread.sleep(2000);
		 * r.keyRelease(KeyEvent.VK_TAB); r.keyRelease(KeyEvent.VK_ENTER);
		 */
		
		 
		 
		
	}

}
