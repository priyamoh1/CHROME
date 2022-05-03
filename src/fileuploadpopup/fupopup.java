package fileuploadpopup;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fupopup {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/registration/createAccount?");
		driver.findElement(By.xpath("//button[.='Upload Resume']")).click();
		StringSelection file=new StringSelection("C:\\Users\\-hp-\\Desktop\\WORK\\CV\\PRIYANK-CV-1.doc");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(file, null);
		Thread.sleep(2000);
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_V);
		Thread.sleep(2000);
		//r.keyPress(KeyEvent.VK_TAB);
		//Thread.sleep(2000);
		//r.keyPress(KeyEvent.VK_TAB);
		//Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_ENTER);
		//r.keyRelease(KeyEvent.VK_TAB);
		
		
	}

}
