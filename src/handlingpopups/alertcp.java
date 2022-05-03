package handlingpopups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertcp {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new  ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		  driver.get("https://demo.actitime.com");//    assignment 1.
		  driver.findElement(By.id("username")).sendKeys("admin");
		  driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		  driver.findElement(By.id("loginButton")).click();
		  driver.findElement(By.xpath("(//div[@class='menu_icon'])[2]")).click();
		  driver.findElement(By.xpath("//a[.='Types of Work']")).click();
		  driver.findElement(By.xpath("//span[.='Create Type of Work']")).click();
		  driver.findElement(By.id("name")).sendKeys("priyaranjan");
		  driver.findElement(By.
		  xpath("//input[contains(@value,'   Create Type of Work   ')]")).click();
		  driver.findElement(By.xpath("(//div[@class='menu_icon'])[2]")).click();
		  driver.findElement(By.xpath("//a[.='Types of Work']")).click();
		  driver.findElement(By.xpath("//input[@value='Cancel and Leave']")).click();
		  driver.findElement(By.xpath("//a[contains(text(),'delete')]")).click(); Alert
		  alt=driver.switchTo().alert(); System.out.println(alt.getText());
		  alt.accept(); alt.dismiss();
		 
		driver.get("https://demo.actitime.com");//     assignment 2.
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		driver.findElement(By.xpath("(//div[@class='menu_icon'])[2]")).click();
		driver.findElement(By.xpath("//a[.='Leave Types']")).click();
		driver.findElement(By.xpath("//span[.='Create Leave Type']")).click();
		driver.findElement(By.id("leaveTypeLightBox_nameField")).sendKeys("priyaranjan");
		driver.findElement(By.xpath("//span[@class='buttonTitle']")).click();
		//driver.findElement(By.xpath("//div[@class='greyButton cancelBtn']")).click();
		driver.findElement(By.xpath("//td[@class='leaveTypeDeleteCell last']")).click();
		Alert alt2=driver.switchTo().alert(); 
		System.out.println(alt2.getText());
		alt2.accept(); 
		//alt.dismiss();
		
        		
	}

}
