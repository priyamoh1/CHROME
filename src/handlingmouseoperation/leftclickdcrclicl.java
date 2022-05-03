package handlingmouseoperation;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class leftclickdcrclicl {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new  ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com");
		WebElement lclick=driver.findElement(By.xpath("//a[.='Forgotten password?']"));
		Actions act=new Actions(driver);
		//act.click(lclick).perform();//left single click.
		//act.doubleClick(lclick).perform();//double click on the link.
		act.contextClick(lclick).perform();
		Robot r=new Robot();
		for (int i=0;i<=2;i++)
		{
			Thread.sleep(1000);
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_ENTER);
			
		}
		
				}

}
