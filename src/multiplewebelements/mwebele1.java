package multiplewebelements;

import java.util.List;
import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class mwebele1 {

	public static void main(String[] args, Object[] argument) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new  ChromeDriver();
		driver.manage().window().maximize();
		/*
		 * driver.get("https://www.myntra.com/");
		 * 
		 * List<WebElement> Links=driver.findElements(By.xpath("//a")); for(int
		 * i=0;i<Links.size();i++) { System.out.println(Links.get(i).getText());// get
		 * all the text present inside myntra webpage. }
		 * System.out.println("------------------url of all links--------------------");
		 * for(int i=0;i<Links.size();i++) {
		 * System.out.println(Links.get(i).getAttribute("href"));//get all the url ofthe
		 * links in myntra webpage. } Thread.sleep(1000);
		 */
		driver.get("https://www.myntra.com/shirts");
		driver.findElement(By.xpath("//div[@class='brand-more']")).click();
		List<WebElement> checkbox=driver.findElements(By.xpath("(//li[@class='FilterDirectory-listTitle '])[2]" + "/..//input[@value='Allen Solly']"));//use dependent and independent xpath
		Thread.sleep(2000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("argument[0].click()", checkbox);
		
		/*
		 * Thread.sleep(3000); checkbox.get(13).click(); Thread.sleep(1000);
		 * checkbox.get(264).click(); Thread.sleep(1000); checkbox.get(344).click();
		 * Thread.sleep(1000); checkbox.get(572).click();
		 */
		 
		
		
		
		
	}

}
