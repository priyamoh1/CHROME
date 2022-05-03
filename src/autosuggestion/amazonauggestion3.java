package autosuggestion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazonauggestion3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new  ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("iphone 13");
		Thread.sleep(3000);
		List<WebElement> amazonsuggestions=driver.findElements(By.xpath("//div[contains(text(),'iphone 13')]"));
		for(int i=0;i<amazonsuggestions.size();i++)
		{
			if(amazonsuggestions.get(i).getText().equalsIgnoreCase("iphone 13 pro"))
			{
				amazonsuggestions.get(i).click();
				break;
			}
			
		}
	}

}
