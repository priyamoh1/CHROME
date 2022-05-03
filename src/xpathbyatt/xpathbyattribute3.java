package xpathbyatt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathbyattribute3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.apptivo.com/app/signup.jsp");
		driver.findElement(By.xpath("//input[@ng-model='signupData.firstName']")).sendKeys("priyaranjan");
		driver.findElement(By.xpath("//input[@ng-model='signupData.lastName']")).sendKeys("mohanty");
		driver.findElement(By.xpath("//input[@ng-model='signupData.emailId']")).sendKeys("pmohantyx@gmail.com");
		driver.findElement(By.xpath("//input[@ng-model='signupData.passwordVal']")).sendKeys("priyamohanty");

	}

}
