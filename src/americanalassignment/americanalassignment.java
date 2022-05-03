package americanalassignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class americanalassignment {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new  ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.americanairlines.in/");
		driver.findElement(By.xpath("//input[@id='reservationFlightSearchForm.originAirport']")).sendKeys("san");
		Thread.sleep(3000);
		List<WebElement> americanairline=driver.findElements(By.xpath("//a[contains(text(),'San')]"));
		Thread.sleep(1000);
		for(int i=0;i<americanairline.size();i++)
		{
			if(americanairline.get(i).getText().equalsIgnoreCase("San Jose (SJO), Costa Rica"))
			{
				Thread.sleep(1000);
				americanairline.get(i).click();
				break;
			}
		}
	}

} 
