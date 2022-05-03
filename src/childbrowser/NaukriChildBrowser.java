package childbrowser;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NaukriChildBrowser 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.naukri.com");
		
		driver.findElement(By.xpath("(//a[@class='view-all-comp'])[1]")).click();
	
		Set<String> windows=driver.getWindowHandles();
		System.out.println(windows.size()); //naukri & view all comp
		
		ArrayList<String> al=new ArrayList<>(windows);
		System.out.println(al.size());
		
		for(int i=0;i<al.size();i++)
		{
			driver.switchTo().window(al.get(i));
			String title=driver.getTitle();
			if(title.contains("Featured companies"))
			{
				driver.switchTo().window(al.get(i));
				System.out.println(driver.getTitle());
				driver.findElement(By.xpath("//h3[@class='main-3 subhead']/..//a[.='Virtusa']")).click();
			}
		}
		
		Set<String> windows1=driver.getWindowHandles();
		System.out.println(windows1.size()); //naukri , view all comp & virtusa
		
		ArrayList<String> al1=new ArrayList<>(windows1);
		System.out.println(al1.size());
		
		for(int i=0;i<al1.size();i++)
		{
			driver.switchTo().window(al1.get(i));
			String title=driver.getTitle();
			if(title.contains("Virtusa"))
			{
				driver.switchTo().window(al1.get(i));
				System.out.println(driver.getTitle());
			}
		}
		
		for(int i=0;i<al1.size();i++)
		{
			driver.switchTo().window(al1.get(i));
			String title=driver.getTitle();
			if(title.contains("Featured companies"))
			{
				driver.switchTo().window(al.get(i));
				System.out.println(driver.getTitle());
				driver.findElement(By.xpath("//span[.='Next']")).click();
				driver.findElement(By.xpath("//h3[@class='main-3 subhead']/..//a[.='Xoriant']")).click();
			}
		}
	}
}