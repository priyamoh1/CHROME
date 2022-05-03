package handlingchatbot;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class handlingchatbot {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.get("https://www.irctc.co.in/nget/train-search");
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='izooto-optin--cta izooto-optin--cta-later']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//img[@style='width: 58px; background: rgb(11, 116, 250) none repeat scroll 0% 0%; height: 58px; position: fixed; border-radius: 29px; right: 16px; box-shadow: rgba(0, 0, 0, 0.16) 0px 7px 6px 1px; display: block;']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//div[@id='askDishaLuncher']")).click();
		driver.switchTo().frame("Disha-Bot");
		driver.findElement(By.xpath("//div[@style='animation-delay: 0.2s; position: relative;']")).click();
		driver.findElement(By.xpath("//input[@id='text']")).sendKeys("How to book tickets on this website ?");
		driver.findElement(By.xpath("//img[@src='https://eticket.ap-south-1.linodeobjects.com/send.png']")).click();
		driver.findElement(By.xpath("//img[@src='https://eticket.ap-south-1.linodeobjects.com/home.png']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//button[@class='popup-button--primary']")).click();
		driver.switchTo().parentFrame();
		Thread.sleep(500);
		driver.findElement(By.xpath("//div[@id='askDishaLuncher']")).click();
		
	}

}
