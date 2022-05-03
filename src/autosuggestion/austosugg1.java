package autosuggestion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class austosugg1 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new  ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://in.search.yahoo.com/?fr2=inr");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("python");
		Thread.sleep(3000);
		//List<WebElement> yahoosuggestions=driver.findElements(By.xpath("//div[@class='pcTkSc']"));
		List<WebElement> yahoosuggestionsch=driver.findElements(By.xpath("//b[contains(text(),'python')]/.."));
		for(int i=0;i<yahoosuggestionsch.size();i++)
		{
			if(yahoosuggestionsch.get(i).getText().equalsIgnoreCase("python programming"))
			{
				yahoosuggestionsch.get(i).click();
				break;
			}
		}
		
		driver.get("https://www.bing.com/");
		driver.findElement(By.xpath("//input[@id='sb_form_q']")).sendKeys("selenium");
		Thread.sleep(3000);
		List<WebElement> bingsuggestionsch=driver.findElements(By.xpath("//span[contains(text(),'selenium ')]"));
		for(int i=0;i<bingsuggestionsch.size();i++)
		{
			if(bingsuggestionsch.get(i).getText().equalsIgnoreCase("selenium python"))
			{
				bingsuggestionsch.get(i).click();
				break;
			}
		}
		
	}

}
