package assign;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class apptivo3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://apptivo.com/app/login.jsp");
		driver.findElement(By.cssSelector("input[id=\"login_email\"]")).sendKeys("priyaranjan");
		driver.findElement(By.cssSelector("input[id=\"login_password\"]")).sendKeys("mohanty");
	}

}
