package chrome;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class urlofapp {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		//driver.navigate().to("https://www.google.com");//open chrome without using get() method
		driver.navigate().refresh();
		String expectedUrl="www.google.com";
		String actualUrl=driver.getCurrentUrl();
		if(actualUrl.equals(expectedUrl))
		{
			System.out.println("url are matching");
		}
			else
			{
		 System.out.println("url are not matching");
			}
		}
	}



