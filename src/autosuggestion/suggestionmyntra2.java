package autosuggestion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class suggestionmyntra2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new  ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://myntra.com");
		driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).sendKeys("levis s ");
		Thread.sleep(3000);
		List<WebElement> myntrasuggestions=driver.findElements(By.xpath("//li[@data-value='/levis-shirts?extra_search_param=isautosuggestentry%3atrue%3a%3aid%3a2297-levis-shirts']"));
		for(int i=0;i<myntrasuggestions.size();i++)
		{
			if(myntrasuggestions.get(i).getText().equalsIgnoreCase("levis shirts"))
			{
				myntrasuggestions.get(i).click();
				break;
			}
			
		}
	}

}
