package handlingmouseoperation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mousehovering {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new  ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.myntra.com");
		WebElement beauty=driver.findElement(By.xpath("//a[.='Beauty']"));
		Actions act=new Actions(driver);
		act.moveToElement(beauty).perform();
		Thread.sleep(1000);
		WebElement eyeshadow=driver.findElement(By.xpath("//a[.='Eyeshadow']"));
		act.moveToElement(eyeshadow).perform();
		
		
	}

}
